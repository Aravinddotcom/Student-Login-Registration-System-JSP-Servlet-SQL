<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam Registration</title>

<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
            <div class="regbox box">
            <h1>Exam Registration</h1>
           
            </br></br>
	<form action="Register" method="post">
		<p>Register Number</p>
		
<input type="text"  name="rollno" required>
				
			<p>Student Name</p>
<input type="text"  name="uname" required>
			
			<p>Password</p>
<input type="password"  name="password" required>

			<p>Date of Birth</p>
<input type="text"  name="dob" required>
		
<p>Gender</p>
<input type="text"  name="gender" required>

<p>Course</p>
<input type="text"  name="course" required>
			
			<p>Email</p>
<input type="text"  name="email" required>

			<p>Phone</p>
<input type="text"  name="phone" required>
				</br></br>
			
				<input type="submit" value="register">
				</br></br>
		<a href="login.jsp">Already Registered? Login</a>

	</form>
	</div>
	</div>
</body>

</html>