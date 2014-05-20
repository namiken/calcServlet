<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>計算</title>
</head>
<body>
計算を行います <br />
<form action="calc.html" method="post">
	<input type="hidden" name="request" value = "calc" />

	<input type="text" name="num1" value=""/>
	
	<select name = "kind">
		<option value = "+"> + </option>
		<option value = "-"> - </option>
		<option value = "/"> / </option>
		<option value = "*"> * </option>
	</select>
	
	<input type="text" name="num2" value=""/>
	
	<input type="submit" />
</form>
</body>
</html>