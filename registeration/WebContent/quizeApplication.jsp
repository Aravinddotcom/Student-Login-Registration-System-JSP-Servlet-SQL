<%@ page import="java.sql.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exam Page</title>
</head>
<body>
<% 
String ans="";
if(request.getParameter("correctAns")!=null)
{
    ans=request.getParameter("correctAns").toString();
}


Connection conn = null;
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/";
String db = "userdb";
String user = "root";
String pass = "root";
Statement st = null;
ResultSet qrst;
ResultSet rs = null;

String rollno=request.getParameter("rollno");
System.out.println("rollno:"+rollno);

int i=1;

String s,g;

int count=0;

try {

Class.forName(driver);
conn = DriverManager.getConnection(url+db,user,pass);

st = conn.createStatement();
//for(i=1;i<=2;i++)
// {
rs = st.executeQuery("select * from quiz");

while(rs.next()) {
%>

<br>
<br/>
<center>

<table border="1" width="500px" bgcolor="#fec180" cellspacing="0" cellpadding="0">
  <tr>
    <td width="100%">

<form name="form1">

 <h2 align="center"><font color="red">Attend the Exam</font></h2>

<b>Select Correct Answer</b>
        <table border="0" width="500px" cellspacing="2" cellpadding="4">
 <tr>
 
 <tr>
<td><b>Register number:</b><%= rs.getString("rollno") %></td></tr>

<td width="50%"> Question:</td>
<input type="hidden" name="correctAns" value="<%=rs.getString(6)%>" />
<tr>
<td><%= rs.getString("quest") %></td></tr>
<tr>
<td>

1: <input type="radio" name="a" value= "QA" /></td>
    <td><%= rs.getString("QA") %></td></tr> 
<tr>
<td>
2: <input type="radio" name="a" value="QB" /></td>
<td><%= rs.getString("QB") %></td></tr>

<tr>
<td>
3: <input type="radio" name="a" value="QC" /></td>
<td><%= rs.getString("QC") %> </td></tr>

<tr>
<td>
4: <input type="radio" name="a" value="QD" /> </td>
<td> <%= rs.getString("QD") %> </td></tr>

<tr>
<td>
<center>
   <input type="submit" value="Submit" name="submit"></center></td></tr>
</table>

</form>
 </td>
  </tr>
</table>
</center>
</body>
<% g=request.getParameter("a");
%>
<% 
if(g.equals(ans)){

count++;
out.println("Correct");

}
else
out.println("false");
%>



<%
}}
// }
catch (Exception ex) {
ex.printStackTrace();

%>

<%
} finally {
if (rs != null) rs.close();
if (st != null) st.close();
if (conn != null) conn.close();
}
out.println("Score="+count);
%>


</html>
