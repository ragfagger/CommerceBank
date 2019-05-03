<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		<form action = "info" method="post">
			Country/Region <br/>
			<select name = "region">
				<option value="United States">United States</option>
				<option value="Canada">Canada</option>
				<option value="Mexico">Mexico</option>
				<option value="United Kingdom">United Kingdom</option>
				<option value="France">France</option>
				<option value="Germany">Germany</option>
				<option value="Spain">Spain</option>
				<option value="Italy">Italy</option>
			</select> 
			<br/><br/>
			Full name<br/><input type="text" name="name">
			<br/><br/>
			Street Address<br/><input type="text" name="address1"><br/><input type="text" name="address2">
			<br/><br/>
			City<br/><input type="text" name="city">
			<br/><br/>
			State / Province / Region<br/><input type="text" name="state">
			<br/><br/>
			Zip Code<br/><input type="text" name="zip">
			<br/><br/>
			Phone Number<br/><input type="text" name="phnumber">
			<br/><br/><br/>
			
			<input type = "submit" value = "Add address">
			
		</form>
		
	</body>
</html>