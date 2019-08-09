package com.woniu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Use extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gname=req.getParameter("gname");
		String gprice=req.getParameter("gprice");
		String gphoto=req.getParameter("gphoto");
		System.out.println(gname+"111"+gprice+"222"+gphoto);
	}
}
