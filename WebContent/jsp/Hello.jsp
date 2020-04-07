<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>

<h1>Hello
<% String pname ; //déclaration de variables
pname = request.getParameter("name"); // request : objet implicite
if(pname == null ){  out.println("World");} else{
%>
Mister <%= pname %>
<%} // fin du else %>
</h1>

</body>
</html>