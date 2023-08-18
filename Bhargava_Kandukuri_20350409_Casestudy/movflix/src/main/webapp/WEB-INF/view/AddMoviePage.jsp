<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
	<meta charset="ISO-8859-1">
    <title>MovFlix</title>
</head>

<body>
	
	<h1>Enter New Movie Details:</h1>
	<br>
	<form action="/movflix/addmovie" method="post">
		Enter Movie ID: <input type="text" id="query" name="movieID"><br>
		Enter Movie Name: <input type="text" id="query" name="movieName"><br>
		Enter Movie Collection: <input type="text" id="query" name="collection">
		<input type="submit" value="ADD">
	</form>
</body>