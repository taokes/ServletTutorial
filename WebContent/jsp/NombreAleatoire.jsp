<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nombre Al�atoire</title>
</head>
<body>
<% int aleat = (int) (Math.random() * 5 );%>
<h1>  Nombre Al�atoire : <%= aleat%></h1>
</body>
</html>