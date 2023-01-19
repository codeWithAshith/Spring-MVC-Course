<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>

	<!-- student should match in the controller -->
	<form:form action="processCustomerForm" modelAttribute="customer">
		<p>
			First Name:
			<form:input path="firstName" />
		</p>
		<p>
			Last Name (*):
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>