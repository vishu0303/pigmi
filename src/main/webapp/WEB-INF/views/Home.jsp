<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pigmi | Home</title>
<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="home">	
		<div class="header"> 
			<div class="title" > Hindupati </div>
			<div class="subtitle"> | Pigmi Stories </div>
			<div class="user"> 
				<div class="photo"> </div>
				<div class="username"> ${username } </div>
			</div>
		</div>
		<div class="menu">
			<div class="menu-flip"></div>
			<div class="menu-list">
				<div class="menu-item" url="/dashboard" > Dashboard </div>
				<div class="menu-item" url="/memberinformation" > Add Member </div>
				<div class="menu-item" url="/installment" > Add Installment </div>
				<div class="menu-item" url="/viewall" > View All </div>
				<div class="menu-item" onClick='redirect("/logout")' > Logout </div>
			</div>
		</div>
		<div class="page-holder">
				body page goes here
		</div>
		
		<div class="footer" > Created with love by Vishwajeet Desai | Guided by Akshay Dongare [ <a href="https://github.com/akshaydongaregit" >https://github.com/akshaydongaregit ] </div>
	<script type="text/javascript" src="/scripts/main.js"></script>
</body>
</html>