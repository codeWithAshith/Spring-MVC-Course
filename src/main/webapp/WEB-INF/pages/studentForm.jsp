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
		<p>
			First Name:
			<form:input path="firstName" />
		</p>
		<p>
			Last Name:
			<form:input path="lastName" />
		</p>
		<p>
			Country:
			<form:select path="country">
				<form:option value="India" label="India" />
				<form:option value="USA" label="USA" />
				<form:option value="China" label="China" />
			</form:select>
		</p>
		
		<!-- populate from java -->
		<p>
			State:
			<form:select path="state">
				<form:options items="${student.stateOptions}" />
			</form:select>
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>