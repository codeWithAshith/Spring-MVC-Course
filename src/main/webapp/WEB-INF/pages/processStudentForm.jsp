<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<p>Operating System</p>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
	<a href="form">Go Back</a>
</body>
</html>