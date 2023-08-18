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
	
	<h1>Search by Movie Name:</h1>
	<br>
	<form action="/movflix/searchbyname" method="post">
		Enter the Movie Name: <input type="text" id="query" name="name" placeholder="search">
		<input type="submit" value="search">
	</form>
</body>