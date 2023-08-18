<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
	<meta charset="ISO-8859-1">
    <title>MovFlix</title>
    <style>
        .class {
    		background-color: blue;
    	}
    	a:link, a:visited {
    		background-color: #f44336;
    		color: white;
    		padding: 14px 25px;
    		text-align: center;
    		text-decoration: none;
    		display: inline-block;
    	}
    	
    	a:hover, a:active {
    		background-color: red;
    	}
    	
    </style>
</head>

<body>

<h1>Admin Login</h1>
<br>
<form action="/movflix/adminpage" method="post">
	User ID: <input type="text" name="username" placeholder="search"><br>
	Password: <input type="text" name="password" placeholder="search">
	<br>
	<input type="submit" value="Login">
</form>


</body>