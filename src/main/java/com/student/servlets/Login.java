package com.student.servlets;

import java.io.IOException;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//collecting the data from the user
		String mail=req.getParameter("mail");
		String password=req.getParameter("password");
		
		//JDBC Implementation
		StudentDAO sdao=new StudentDAOImpl();
		Student s1=sdao.getStudent(mail, password);
		if(s1!=null)
		{
			resp.sendRedirect("servlet2");
		}
		else
		{
			resp.sendRedirect("failure.html");
		}
	}
}
