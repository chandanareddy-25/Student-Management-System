<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>This is first web app</h1>
      <label>Existing student:</label>
      <a href="./login.jsp">LOGIN</a>
    <form name="registration" method="post" action="StudentController">
    <input type="text" name="username" id="username" placeholder="USERNAME">
    <input type="text" name="firstname" id="firstname" placeholder="FIRSTNAME">
    <input type="text" name="lastname" id="lastname" placeholder="LASTNAME">
    <input type="password" name="password" id="password" placeholder="PASSWORD">
     <input type="password" name="repassword" id="repassword" placeholder="RE-ENTER PASSWORD">
    <button type="submit" name="btn1" id="btn1">SUBMIT</button>
    </form>
</body>
</html>