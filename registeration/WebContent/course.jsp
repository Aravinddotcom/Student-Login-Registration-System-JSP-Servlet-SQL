<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <head>
  <script type="text/javascript">

   function changeFunc() {
    var selectBox = document.getElementById("selectBox");
    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
    alert(selectedValue);
   }

  </script>
 </head>
 <body>
  <select id="selectBox" onchange="changeFunc();">
   <option value="1">Option #1</option>
   <option value="2">Option #2</option>
  </select>
 </body>
</html>