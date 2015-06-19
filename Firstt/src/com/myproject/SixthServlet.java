package com.myproject;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SixthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
			
			
			String var3 = req.getParameter("var3");
			String var4 = req.getParameter("var4");
			int i1 = 0;
			int i2 = 0;
			
			try{
			i1 = Integer.parseInt(var3); 
			i2 = Integer.parseInt(var4);} catch (NumberFormatException ex) {
				resp.getWriter().println("Ошибка ввода");
				return;
			}
			
			if ((i1 > i2) || (i1 < 0) || (i2 > 65535)) {
				resp.getWriter().print("Ошибка ввода");
			} else {
				resp.getWriter().print("<table border=1, cellpadding=7>");
				for (int i = i1; i <= i2; i++) {
					resp.getWriter().print("<tr>");
					for (int j = 0; (j < 10) && (i <= i2); j++) {
						resp.getWriter().println("<td>");
						resp.getWriter().println("&#" + i + "<br>" + " Int: " + i + "<br>" + " Hex: " + Integer.toHexString(i));
						i++;
					}
					i--;
					resp.getWriter().print("</tr>");
				}
				resp.getWriter().print("</table>");
			}
		}
}
