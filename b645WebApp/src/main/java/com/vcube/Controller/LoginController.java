package com.vcube.Controller;

import java.io.IOException;

import com.vcube.Model.LoginModel;
import com.vcube.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginModel lm=new LoginModel();
		lm.setUsername(username);
		lm.setPassword(password);
		
		StudentDAO sd=new StudentDAO();
		String status=sd.selectStudent(lm);
		if(status.equals("success")) {
			//request.setAttribute("un",username);
			//to track session
			HttpSession session=request.getSession();
			session.setAttribute("un", username);
			if(username.equals("Saichandanareddy") && password.equals("1234")) {
				  RequestDispatcher rd=request.getRequestDispatcher("Adminhome.jsp");
				  rd.forward(request,response);
			}else {
			  RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			  rd.forward(request,response);
			}
			 
		}else {
			  
			  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			  rd.forward(request,response);
			  
		  }
		
	}

}
