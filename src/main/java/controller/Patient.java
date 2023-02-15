package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Patientdao.Patientdao;
import Patientdto.Patientdto;

public class Patient extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("pid");
		System.out.println(s1);
		
		String s2=req.getParameter("pname");
		System.out.println(s2);
		
		String s3=req.getParameter("bg");
		System.out.println(s3);
		
		Patientdto p1=new Patientdto();
		p1.setPid(s1);
		p1.setPname(s2);
		p1.setBg(s3);
		
		Patientdao patientdao=new Patientdao();
		patientdao.insert(p1);
	}
}
