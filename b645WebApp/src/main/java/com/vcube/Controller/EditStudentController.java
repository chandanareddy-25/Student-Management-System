package com.vcube.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

import com.vcube.Model.Student;
import com.vcube.dao.StudentDAO;


@WebServlet("/EditStudentController")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student s=new Student();
		//setting directly frontend data to the modal without local variable
		s.setUsername(request.getParameter("username"));
		s.setFirstname(request.getParameter("firstname"));
		s.setLastname(request.getParameter("lastname"));
		s.setPassword(request.getParameter("password"));
		StudentDAO sd=new StudentDAO();
		String status=sd.update(s);
		if(status.equals("success")) {
			
			response.sendRedirect(request.getContextPath()+"/Adminhome.jsp");
		}else {
			response.sendRedirect(request.getContextPath()+"/Adminhome.jsp");
		}
	}

}
