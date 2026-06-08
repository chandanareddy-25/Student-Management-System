<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME <%=session.getAttribute("un") %></h1>
<a href="LogoutController">LOGOUT</a>
<a href="./contact.jsp">CONTACT US</a>
</body>
</html>