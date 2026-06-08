package com.vcube.Controller;

import java.io.IOException;

import com.vcube.Model.Student;
import com.vcube.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public StudentController() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("hello iam servlet");
			  String username=request.getParameter("username");
			  String firstname=request.getParameter("firstname");
			  String lastname=request.getParameter("lastname");
			  String password=request.getParameter("password");
			  
			  System.out.println(username+" "+firstname+" "+lastname+" "+password);
			  Student s=new Student();
			  s.setUsername(username);
			  s.setFirstname(firstname);
			  s.setLastname(lastname);
			  s.setPassword(password);
			  
			  System.out.println(s);
			  
			  StudentDAO sd=new StudentDAO();
			  String status=sd.insertStudent2(s);
			  if(status.equals("success")) {
				  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				  rd.forward(request,response);
				 
			  }else {
				  
				  RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				  rd.forward(request,response);
				  
			  }
			  
			  
			  
	}

}
