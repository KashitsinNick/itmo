package com.myproject;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
			
			
			String var3 = req.getParameter("var3");
			String var4 = req.getParameter("var4");
			String var5 = req.getParameter("var5");
		
			int a;
			int b;
			int c;
						
			try{
			a = Integer.parseInt(var3);
			b = Integer.parseInt(var4);
			c = Integer.parseInt(var5);} catch (NumberFormatException ex) {
				resp.getWriter().println("Ошибка ввода");
				return;
			}
			
			
			double d = (Math.pow(b,2)-4*a*c);
			if( d < 0){
				resp.getWriter().println("Корней нет");
				return;
			} else if(d == 0){
				resp.getWriter().println("Корень один и он равен  "+ (-b + Math.sqrt(d)/(2*a)));
			}else if(d > 0){
				resp.getWriter().println("Первый корень равен  "+ (-b + Math.sqrt(d))/(2*a) + "<br>" + ("Второй корень равен  " + (-b - Math.sqrt(d))/(2*a)));
			}							
				
		
	}
}
