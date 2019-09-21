<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Installment</title>
<link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body class="body">
	<div class="form installment">
		<div class="header">
			<label class="l1">Installment</label>
		</div>	
		<div class="form-body">
			<table class="table">
				<tr>
					
					<td><label class="l3">Name</label></td>
					<td><select class="text"></select></td>
				</tr>
				<tr>
					<td><label class="l3">Year</label></td>
					<td><input class="text" type="text" name="txt_year"></td>
				</tr>
				<tr>
					<td><label class="l3">Month</label></td>
					<td><input class="text" type="text" name="txt_month"></td>
				</tr>
				<tr>
					<td><label class="l3">Investment</label></td>
					<td><input class="text" type="text" name="txt_invesment"></td>
				</tr>
				<tr>
					<td><label class="l3">Fine</label></td>
					<td><input class="text" type="text" name="txt_fine"></td>
	
				</tr>
			</table>
			<button class="button" name="btn_add">Add</button>
			<button class="button" name="btn_update">Update</button>
			<button class="button" name="btn_clear">Clear</button>
		</div>
	</div>	
</body>
</html>