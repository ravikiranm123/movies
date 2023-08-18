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

<h1>Movie Admin Page</h1>

<a href="/movflix/addmovie">Add Movie</a>
<a href="/movflix/modifymovie">Modify Movie</a>
<br>
<br>
<a href="/movflix">HOME</a>

</body>