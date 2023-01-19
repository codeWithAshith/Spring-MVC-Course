<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentForm</title>
</head>
<body>
	<p>First Name: ${student.firstName}</p>
	<p>Last Name: ${student.lastName}</p>
	<p>Country: ${student.country}</p>
	<p>State: ${student.state}</p>
	<p>Favorite Language: ${student.favoriteLanguage}</p>
	
	<a href="form">Go Back</a>
</body>
</html>