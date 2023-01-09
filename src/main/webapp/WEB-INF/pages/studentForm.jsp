<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>


	<!-- student should match in the controller -->
	<form:form action="processStudentForm" modelAttribute="student">

		First Name: <form:input path="firstName" />

		<br />
		<br />
		
		Last Name: <form:input path="lastName" />

		<br />
		<br />

		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>