<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Processing New User</title>
</head>
<body>
<p>
<?php
	$hardcodedPwdHash=password_hash("nothing",PASSWORD_DEFAULT);
	$email = $_GET['email'];
	$fname = $_GET['fname'];
	$lname = $_GET['lname'];
	$emp_ID = $_GET['emp_ID'];
	$admin = $_GET['administrator'];
	$phone = $_GET['phone'];
	$street_add = $_GET['street_add'];
	$apt = $_GET['apt'];
	$city = $_GET['city'];
	$state = $_GET['state'];
	$zip = $_GET['zip'];
    $userpwd = $_GET['userpwd'];
	$userEnteredPwdHash = password_hash($userpwd,PASSWORD_DEFAULT);
	  
	try
	{
	$pdo = new PDO('mysql:host=localhost;dbname=street_lights3', 'kmo1', 'kMoOne');
	$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
	$pdo->exec('SET NAMES "utf8"');
	}
	catch (PDOException $e)
	{
	$error = 'Unable to connect to the database server.';
	echo $error;
	exit();
	}
	
	$sql = 'SELECT * FROM user';
		$result = $pdo->query($sql);
		foreach($result as $results) { 
		
			$lastRecordID = $results['user_ID'];
		}
		$lastRecordID++;
		echo $lastRecordID;

	try
	{
	$sql = "INSERT INTO user (user_ID, fname, lname, email, phone, user_type)
	VALUES ($lastRecordID, '$fname', '$lname', '$email', '$phone', 'emp_user')";
	$pdo->exec($sql);
	}
	
	catch (PDOException $e)
	{
	$error = 'Error creating new user';
	echo $error;
	exit();
	}
	
	try
	{
	$sql = "INSERT INTO employee (user_ID, emp_ID, administrator, pw)
	VALUES ($lastRecordID, '$emp_ID', '$admin','$userEnteredPwdHash')";
	$pdo->exec($sql);
	}
	
	catch (PDOException $e)
	{
	$error = 'Error creating reg user';
	echo $error;
	exit();
	}
	
	header('Location: admin_home.html.php');
	exit();
	
?>
</p>
</body>
</html>
