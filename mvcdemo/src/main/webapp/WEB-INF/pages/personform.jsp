<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="personForm"  modelAttribute="personObj">
	<table>
		<tr>
			<td><label for="firstname">Enter Firstname</label></td>
			<td><form:input path="firstname"/></td>
		</tr>
		<tr>
			<td><label for="lastname">Enter lastname</label></td>
			<td><form:input path="lastname"/></td>
		</tr>
<tr>
<td><label for="email">Enter Email</label></td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><label for="phone">Enter Phone</label></td>
<td><form:input path="phone"/></td>
</tr>
<tr>
<td><input type="submit" value="Add Person"></td>
</tr>
</table>
</form:form>
${personObj.toString() }
</body>
</html>