package com.myproject;

import java.io.IOException;
import com.myproject.Questions;
import javax.servlet.http.*;
import java.text.ParseException;

//@SuppressWarnings("serial")
public class ExceptionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Questions[] questions = new Questions[ 4 ];
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		Questions vopr1= new Questions();
		questions[0]=vopr1;
		vopr1.ques="<p>Напишите первый месяц лета</p>";
		vopr1.ans="Июнь";
		
		Questions vopr2= new Questions();
		questions[1]=vopr2;
		vopr2.ques="<p>Вычислите корень из 121</p>";
		vopr2.number=11;
		
		
		Questions vopr3= new Questions();
		questions[2]=vopr3;
		vopr3.ques="<p>Введите дату начала Второй мировой войны (в формате дд.мм.гггг)</p>";
		vopr3.data="01.09.1939";
		
				
		Questions vopr4= new Questions();
		questions[3]=vopr4;
		vopr4.ques="<p>Напишите фамилию действующего президента США</p>";
		vopr4.ans="Обама";
		
				
		int flag = Integer.parseInt(req.getParameter("flag"));
		if (flag==1)
		{	
			QuestionWrite(questions,resp);
		}
	else if (flag==2)
		{
		try {
			answerCheck(questions, req.getParameter("vopr"), req.getParameter("vopros"),resp);
			
		} catch (MyException e) {
			resp.getWriter().println(e.getMessage());
			resp.getWriter().println("<p>Ошибка ввода </p>");	
			
		} catch (ParseException e){
			resp.getWriter().println("<br>");
			resp.getWriter().println("<p>Ошибка ввода даты</p>");	
		}
		catch (NumberFormatException e){
			resp.getWriter().println("<br>");
			resp.getWriter().println("<p>Ошибка ввода числа</p>");	
			
		} 
		}
	}
		public static void QuestionWrite(Questions[] a,HttpServletResponse resp) throws IOException {
		resp.getWriter().println("<br>");
		int mst=(int)(Math.random()*4);
		resp.getWriter().println(a[mst].ques+"<input  type=\"hidden\" id=\"trash\" value="+mst+">");
		
	}
		public static void answerCheck(Questions[] a, String b, String c,HttpServletResponse resp) throws IOException, MyException, NumberFormatException, ParseException {
				int mst=Integer.parseInt(c);
				int fffag = a[mst].checkString(b);
				if (fffag==1){
				resp.getWriter().println("<br>");
				resp.getWriter().println("<p>Верно</p>");
				}
				else{
				resp.getWriter().println("<br>");
				resp.getWriter().println("<p>Неверно</p>");
				
				}
		}
}