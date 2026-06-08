<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.*,com.vcube.dao.StudentDAO,com.vcube.Model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>

</head>
<body>
<h1>WELCOME ADMIN  : <%=session.getAttribute("un") %></h1>
<% StudentDAO sd=new StudentDAO();
  List<Student> list=sd.selectAllStudents();%>

<table class="table table-hover">
<tr>
<th>USERNAME</th>
<th>FIRSTNAME</th>
<th>LASTNAME</th>
<th>PASSWORD</th>
<th colspan=2>ACTION</th>
</tr>
<%for(Student s:list){ %>
<tr>
 <td><%=s.getUsername() %></td>
 <td><%=s.getFirstname() %></td>
 <td><%=s.getLastname() %></td>
 <td><%=s.getPassword() %></td>
 <td><a href="editStudent.jsp?u=<%=s.getUsername() %>">EDIT</a>
 <td><a href="DeleteController?u=<%=s.getUsername() %>">DELETE</a>
 
 </tr>
<% } %>
</table>
</body>
</html>