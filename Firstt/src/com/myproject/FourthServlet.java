package com.myproject;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FourthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			int max = 0;
			int[][] a=new int[8][5];
			   for (int i=0;i < 8;i++){
			    for (int j=0;j < 5;j++){
			      a[i][j]=((int)(Math.random()*199-99));
			      resp.getWriter().print(a[i][j]+" ");
			      if(a[i][j] > max)
			      {
			    	  max = a[i][j];
			    };}
			      resp.getWriter().print("<br>");
			      }
			      resp.getWriter().print("<br> Максимальное значение:"+max);
				}
	}

