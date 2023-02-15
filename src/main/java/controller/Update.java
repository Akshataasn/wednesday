package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Patientdao.Patientdao;
@WebServlet("/xxx")
public class Update extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("pid");
		String s2=req.getParameter("pbg");
		
      Patientdao p=new Patientdao();
      p.update(s1,s2);	
	}
}
