package com.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
		//		name = "selectliquorservlet",
		urlPatterns = "/SAMLLoginController"
)
public class SAMLLoginController extends HttpServlet
{
	@Override
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
	{
		System.out.println(req);

		System.out.println("*************************************************************************************");

		System.out.println(resp);


		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.write("Inside SAMLLoginController servlet..");
		String un = req.getParameter("username");
		String pw = req.getParameter("password");

		System.out.println(un);
		System.out.println(pw);
	}

	@Override
	protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
	{
		this.doGet( req, resp );
	}
}
