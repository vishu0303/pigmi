<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pigmi | Sign Up</title>
<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="body">
	<div class="form signup">
		<div class="header">
			<label >Sign Up</label>
		</div>
		<div class="form-body">
			<c:if test="${error ne null }" >
				<div class="error">
				<label> ${error} </label>
				</div>
			</c:if>
			<c:if test="${info ne null}">
				<div class="info">
				<label> ${info} </label>
				</div>
			</c:if>
			
			<form:form modelAttribute="user" method = "POST" action="/signup">
			<table class="table">
				<tr>
					<td><label>Name</label></td>
					<td><form:input path="name" class="text" type="text" name="txt_name" /> </td>
				</tr>
				<tr>
					<td><label >Mobile No. </label></td>
					<td><form:input path="mobileNo" class="text" type="text" name="txt_mobile_no" /></td>
				</tr>
				<tr>
					<td><label >Address </label></td>
					<td><form:input path="address" class="text" type="text" name="txt_address" /></td>
				</tr>
				<tr>
					<td><label >User Name </label></td>
					<td><form:input path="userName" class="text" type="text" name="txt_username" /></td>
				</tr>
				<tr>
					<td><label >Password </label></td>
					<td><form:input path="password" class="text" type="Password" name="txt_password" /></td>
				</tr>
			</table>		
			<input type="submit" class="button" name="b_login" value="SignUp"/>
			<button class="button" name="b_cancel">Clear</button>
			</form:form>
		</div>
	</div>
</body>
</html>