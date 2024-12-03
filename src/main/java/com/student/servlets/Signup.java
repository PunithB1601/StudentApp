package com.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class Signup extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String phonenumber=req.getParameter("phone");
	String mail=req.getParameter("mail");
	String branch=req.getParameter("branch");
	String loc=req.getParameter("loc");
	String password=req.getParameter("password");
	String confirmpassword=req.getParameter("confirm");
	
	//PrintWriter out=resp.getWriter();
	
	long phone=Long.parseLong(phonenumber);
	
	StudentDAO sdao=new StudentDAOImpl();
	Student s=new Student();
	if(password.equals(confirmpassword))
	{
		s.setName(name);
		s.setPhone(phone);
		s.setMail(mail);
		s.setBranch(branch);
		s.setLocation(loc);
		s.setPass(password);
		boolean result=sdao.insertStudent(s);
		if(result)
		{
			req.setAttribute("success", "Signup successful");
			RequestDispatcher rd=req.getRequestDispatcher("Signup.jsp");
			rd.forward(req, resp);
			//out.println("<h1>Signup successful</h1>");
			
		}
		else
		{
			req.setAttribute("failure","Signup failed");
			RequestDispatcher rd=req.getRequestDispatcher("Signup.jsp");
			rd.forward(req, resp);
			//out.println("<h1>Signup failed</h1>");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
