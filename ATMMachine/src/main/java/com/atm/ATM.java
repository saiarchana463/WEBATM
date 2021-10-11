package com.atm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ATM extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String no = req.getParameter("accountNo");
		PrintWriter out = res.getWriter();
		out.print("Account No : "+no);
	}

}
