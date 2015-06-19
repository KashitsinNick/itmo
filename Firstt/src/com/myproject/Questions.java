package com.myproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Questions {
	
	int number = -1;
	int flag =1;
	
	String ans = "-1";
	String ques = "-1";
	String data = "-1";
	
	
	public int checkString(String otv) throws MyException, NumberFormatException, ParseException{
		
		if (!ans.equals("-1")){
			if (!ans.equals(otv)){
				
			throw new MyException("<br><p>Неверно</p><br>");
			}
		}
		
		if (number!=-1){
			if (number!=Integer.parseInt(otv)){
			flag=0;
			}
		}
		
		if (!data.equals("-1")){
			SimpleDateFormat formatdat = new SimpleDateFormat();
			formatdat.applyPattern("dd.MM.yyyy");
			Date docDate= formatdat.parse(otv);
			Date otvDate=formatdat.parse(data);
			if (!otvDate.equals(docDate)) flag=0;
		}
			System.out.print(flag);
			return flag;
			
	}
}
