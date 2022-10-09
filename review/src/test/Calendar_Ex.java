package test;

import java.util.Calendar;

public class Calendar_Ex {
	
	public static void main(String[] args) {
		
		int year = 1989, age = 0;
		
		
		Calendar cal = Calendar.getInstance();
		
		age = cal.get(Calendar.YEAR) - year;
		
		System.out.println("나이:"+age);
		System.out.println("출생년도:"+year);
		
		System.out.print("오늘의 날짜:");
		System.out.print(cal.get(Calendar.YEAR)+"/");
		System.out.print(cal.get(Calendar.MONTH)+1+"/");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH));
		
	}
	
}
	


