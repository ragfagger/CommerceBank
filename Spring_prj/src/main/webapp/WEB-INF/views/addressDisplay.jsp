<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>The Address Info</title>
	</head>
	<body>
		
		region : ${customerRegion}
		<br/>
		name : ${customerName}
		<br/>
		address1 : ${customeraddress1}
		<br/>
		address2 : ${customeraddress2}
		<br/>
		city : ${customerCity}
		<br/>
		state : ${customerState}
		<br/>
		zip : ${customerZip}
		<br/>
		phnumber : ${customerPhoneNumber}
		<br/><br/>
		
		<form action = "input" method = "post">
			<input type = "submit" value = "Add another address">
		</form>
	</body>
</html>