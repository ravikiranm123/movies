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
	
	<h1>Search by Movie Collection:</h1>
	<br>
	<form action="/movflix/searchbycollection" method="post">
		From: <input type="number" name="from"> To <input type="number" name="to">
		<input type="submit" value="search">
	</form>
</body>