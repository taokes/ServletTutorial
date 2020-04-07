<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info Utilisateur</title>
</head>
<body bgcolor="#ffffcc">
<center>
<%if (request.getParameter("name")== null 
&& request.getParameter("email")== null ){%> 
	<h2>Information utilisateur</h2>
	<form method="get" action="exemple2/web/process.jsp">
	<p> Votre nom :<input type="text" name="nom" size=26> </p>
		<p> Votre email :<input type="text" name="email" size=26> </p>
	<p> <input type="submit" value="envoyer" ></p>
	</form>
<% }else{%>
<%! String nom, email ; %>

<% nom = request.getParameter("name");
   email=  request.getParameter("email");
%> 
<p><b> Vous avez fourni les informations suivantes : </b></p>
<p><b> Name : </b><%= nom %></p>
<p><b> Email : </b>  <%= email %></p>
<% }%>
</center>



</body>
</html>