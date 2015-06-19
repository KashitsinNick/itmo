package com.myproject;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
			 int[][] a=new int[8][5];
			   for (int i=0;i < 8;i++){
			    for (int j=0;j < 5;j++){
			      a[i][j]=((int)(Math.random()*89+10));
			      resp.getWriter().print(a[i][j]+" ");}
			      resp.getWriter().print("<br>");
			      }
				}
	}

