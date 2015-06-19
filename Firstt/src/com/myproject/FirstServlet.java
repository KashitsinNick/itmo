package com.myproject;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
			
			
			String var1 = req.getParameter("var1");
			String var2 = req.getParameter("var2");
			double i1 = 0;
			double i2 = 0;
			
			try{
			i1 = Double.parseDouble(var1); 
			i2 = Double.parseDouble(var2);} catch (NumberFormatException ex) {
				resp.getWriter().println("Ошибка ввода");
				return;
			}
			
			double i3 = 10;
							
			double result=0;
			
			if(Math.abs(i3-i1)>Math.abs(i3-i2)){
			result = i2;
			} else if(Math.abs(i3-i1)==Math.abs(i3-i2)){ 
				resp.getWriter().println("Оба равны");
			} else result = i1;
			resp.getWriter().println(result);
		
			

	}
}
