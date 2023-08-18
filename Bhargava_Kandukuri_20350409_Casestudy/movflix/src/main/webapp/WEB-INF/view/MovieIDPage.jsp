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
    		padding: 10px 20px;
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
        <h1>Movie Details</h1>

        <form:form>

            <table border="1">
            	<tr>
            		<th>Movie ID</th>
            		<th>Movie Name</th>
            		<th>Movie Collection</th>
            	</tr>
                <tr>
               		<td>${movie.movieID}</td>
               		<td>${movie.movieName}</td>
               		<td>${movie.collection}</td>
                </tr>

            </table>

        </form:form>
        <br>
        <a href="/movflix">HOME</a>
	
</body>