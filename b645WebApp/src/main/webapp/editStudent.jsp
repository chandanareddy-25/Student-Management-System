<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.*,com.vcube.dao.StudentDAO,com.vcube.Model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% Student s=null;
 StudentDAO sd=new StudentDAO();
 s=sd.getStudentByUsername(request.getParameter("u"));%>
 <h1>Welcome : <%=session.getAttribute("un") %></h1>
 <form name="editStudent" method="post" action="EditStudentController">
 <input type="text" name="firstname" id="firstname"value=<%=s.getFirstname() %> placeholder=firstname>
  <input type="text" name="lastname" id="lastname"value=<%=s.getLastname() %> placeholder=lastname>
   <input type="hidden" name="username" id="firstname"value=<%=s.getUsername() %> >
    <input type="password" name="password" id="password"value=<%=s.getPassword() %> placeholder=password>
    <button type="submit">Update</button>
 </form>

</body>
</html>