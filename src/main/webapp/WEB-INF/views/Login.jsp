<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pigmi | Login</title>

<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="body">
	<div class="form login">
		<div class="header">
			<label>Login</label>
		</div>	
		
		<div class="form-body">
		
		<c:if test="${error ne null }" >
				<div class="error">
				<label> ${error} </label>
				</div>
		</c:if>
		<form action="/login" method="POST"  >
			<table class="table">
				<tr>
					<td><label>User Name</label></td>
					<td><input class="text" type="text" id="username" name="username" ></select></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input class="text" type="password" name="pswd"></td>
				</tr>
				<tr>
					<td colspan="2"> <label class="forget-pswd"> Forget Password</label> </td>
				</tr>
			</table>
			<input type="submit" class="button inline" name="b_login" value="Login"/>
			<label class="button inline" name="btn_update" onClick='document.location = "/signup" '> Signup </label>
			</form>
			
		</div>
	</div>	
</body>
</html>