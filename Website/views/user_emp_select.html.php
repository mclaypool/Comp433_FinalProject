<!DOCTYPE html>

<!-- COMP-453-002
Fall 2015
Homework5
Kevin Morrissey
-->

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Street Light Maintenance Select</title>
    <style type="text/css">
    textarea {
      display: block;
      width: 100%;
    }
    </style>
  </head>
  <body>
  
	<?php

	try
	{
		$sql = 'SELECT user_ID from employee';
		$result = $pdo->query($sql);
	}
	catch (PDOException $e)
	{
		$error = 'Error fetching users: ' . $e->getMessage();
		include 'error.html.php';
		exit();
	}
	
	
	?>
	<p><strong>Select Employee User</strong></p>
	<form action="?emp_update" method="post">
	<div><label>Select User:</label>
	<select name="user_ID">
	<option selected="selected">Choose one</option>
	<?php
		foreach($result as $results) { ?>
			<option value="<?= $results['user_ID'] ?>"><?= $results['user_ID'] ?></option>
	<?php
		} ?>
	</select>
	
	  <div><input type="submit" value="Select"></div>
    </form>

  </body>
</html>
