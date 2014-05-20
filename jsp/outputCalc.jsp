<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>計算結果</title>
</head>
<body>
計算結果を出力します<br />
<%=request.getParameter("num1") %>
<%=request.getParameter("kind") %>
<%=request.getParameter("num2") %>
 = 
 <%=request.getAttribute("num3") %>
 
<form action="calc.html" method="post">
	<input type="submit" value="戻る" />
</form>
</body>
</html>