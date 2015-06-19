package com.myproject;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FifthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
			
			
			String var1 = req.getParameter("var1");
			String var2 = req.getParameter("var2");
			int i1 = 0;
			int i2 = 0;
			
			try{
			i1 = Integer.parseInt(var1); 
			i2 = Integer.parseInt(var2);} catch (NumberFormatException ex) {
				resp.getWriter().println("Ошибка ввода");
				return;
			}
			
			if ((i1 > i2) || (i1 < 0) || (i2 > 65535)) {
				resp.getWriter().print("Ошибка ввода");
			} else {
				resp.getWriter().print("<table border=1, cellpadding=5>");
				for (int i = i1; i <= i2; i++) {
					resp.getWriter().print("<tr>");
					for (int j = 0; (j < 10) && (i <= i2); j++) {
						resp.getWriter().println("<td>&#"+ i);
						i++;
					}
					i--;
					resp.getWriter().print("</tr>");
				}
				resp.getWriter().print("</table>");
			}
		}
}
