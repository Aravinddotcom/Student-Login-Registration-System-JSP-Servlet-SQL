<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam Login</title>

<link href="css/style1.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
            <div class="regbox box">
            <h1>Exam Login</h1>
</br></br>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<p>Register Number</p>
		
<input type="text"  name="rollno" required>
			<p>Password</p>
<input type="password"  name="password" required>		
	</br></br>
				<input type="submit" name="submit" value="Login">
			</br>
				<a href="memberRegister.jsp">New? Sign up</a>
			
		

	</form>
</body>
</html>