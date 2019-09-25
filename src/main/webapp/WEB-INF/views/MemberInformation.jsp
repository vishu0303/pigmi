<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pigmi | Member Information</title>
<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="body">
	<div class="form member-info">
		<div class="header">
			<label >Member Information</label>
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
		<form:form modelAttribute="member" method = "POST" action="/memberinformation">
			<table class="table">
				<tr>
					<td><label >Name</label></td>
					<td><form:input path="name" class="text" type="text" name="txt_name" /></td>
				</tr>
				<tr>
					<td><label >Mobile No.</label></td>
					<td><form:input path="mobileNo" class="text" type="number" name="txt_number" /></td>
				</tr>
				<tr>
					<td><label >Address</label></td>
					<td><form:input path="address" class="text" type="text" name="txt_address" /></td>
	
				</tr>
				
			</table>
			
			<button class="button" name="btn_add">Add</button>
			<button class="button" name="btn_update">Update</button>
			<button class="button" name="btn_search">Search</button>
			<button class="button" name="btn_delete">Delete</button>
			<button class="button" name="btn_clear">Clear</button>
			</form:form>
		</div>
	</div>
</body>
</html>