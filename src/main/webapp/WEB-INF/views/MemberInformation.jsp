<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<table class="table">
				<tr>
					<td><label >Name</label></td>
					<td><input class="text" type="text" name="txt_name"></td>
				</tr>
				<tr>
					<td><label >Mobile No.</label></td>
					<td><input class="text" type="number" name="txt_number"></td>
				</tr>
				<tr>
					<td><label >Address</label></td>
					<td><input class="text" type="text" name="txt_address"></td>
	
				</tr>
			</table>
			
			<button class="button" name="btn_add">Add</button>
			<button class="button" name="btn_update">Update</button>
			<button class="button" name="btn_search">Search</button>
			<button class="button" name="btn_delete">Delete</button>
			<button class="button" name="btn_clear">Clear</button>
		</div>
	</div>
</body>
</html>