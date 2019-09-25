<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pigmi | Installment</title>
<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="body">
	<div class="form installment">
		<div class="header">
			<label class="l1">Installment</label>
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
			<form:form modelAttribute="installment" method = "POST" action="/installment">
			<table class="table">
				<tr>
					
					<td><label class="l3">Name</label></td>
					<td><form:select path="memberId" items="${membersList}" class="text" type="text" name="txt_name"/></td>
				</tr>
				<tr>
					<td><label class="l3">Year</label></td>
					<td><form:input path="year" class="text" type="text" name="txt_year"/></td>
				</tr>
				<tr>
					<td><label class="l3">Month</label></td>
					<td><form:input path="month" class="text" type="text" name="txt_month"/></td>
				</tr>
				<tr>
					<td><label class="l3">Investment</label></td>
					<td><form:input path="investment" class="text" type="text" name="txt_invesment"/></td>
				</tr>
				<tr>
					<td><label class="l3">Fine</label></td>
					<td><form:input path="fine" class="text" type="text" name="txt_fine"/></td>
	
				</tr>
			</table>
			<button class="button" name="btn_add">Add</button>
			<button class="button" name="btn_update">Update</button>
			<button class="button" name="btn_clear">Clear</button>
			</form:form>
		</div>
	</div>	
</body>
</html>