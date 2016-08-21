
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Create an Employee Account</title>
  </head>
  <body>
	<p><strong>Enter a user name and pw to create an account.</strong></p>
    <form action="processNewEmpUser.php" method="get">
	   <div><label for="fname">First Name:
        <input type="text" required name="fname" id="fname"></label>
      </div>
	  <div><label for="lname">Last Name:
        <input type="text" required name="lname" id="lname"></label>
      </div>
	  <div><label for="emp_ID">Employee ID:
        <input type="text" required name="emp_ID" id="emp_ID"></label>
      </div>
	   <div><label for="administrator">Administrator? (Y/N):
        <input type="text" required name="administrator" id="administrator"></label>
      </div>
	  <div><label for="email">Email:
        <input type="text" required name="email" id="email"></label>
      </div>
	   <div><label for="phone">Phone:
        <input type="text" required name="phone" id="phone"></label>
      </div>
	   <div><label for="street_add">Street Address:
        <input type="text" required name="street_add" id="street_add"></label>
      </div>
	   <div><label for="apt">Apt #:
        <input type="text" name="apt" id="apt"></label>
      </div
	   <div><label for="city">City:
        <input type="text" required name="city" id="city"></label>
      </div>
	   <div><label for="state">State:
        <input type="text" required name="state" id="state"></label>
      </div>
	   <div><label for="zip">Zip:
        <input type="text" required name="zip" id="zip"></label>
      </div>
      <div><label for="userpwd">Password:
        <input type="text" required name="userpwd" id="userpwd"></label>
      </div>
      <div><input type="submit" value="Submit"></div>
    </form>
  </body>
</html>

