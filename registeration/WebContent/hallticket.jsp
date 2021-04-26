<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>

<title> Hall Ticket</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width">

</head>

<body>
<h1>Print Hallticket</h1>

	<form action="./Servlet1">
		<table>
			<tr>
				<td>Please Enter the Register No: </td>
				<td><input type="text" name="rollno"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search"></td>
			</tr>
		</table>

	</form>

</body>

</html>