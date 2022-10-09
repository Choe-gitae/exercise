package basic1;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_Control {

	public static void main(String[] args) {

		String id = null;	// 변수 id / 주민번호
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호를 입력해 주세요.");
		id = input.nextLine();
		input.close();
		
		char sung = id.charAt(7);	// 변수 성
		System.out.println(sung);
		
		if(sung == '1' | sung == '3' | sung == '9') {
			System.out.println("남자");
		}else if(sung == '2' | sung == '4' | sung == '0') {
			System.out.println("여자");
		}
		
		char chul = id.charAt(8);	// 변수 출신지역
		System.out.println(chul);
		
		String home = null;		// 변수 고향
		switch (chul) {
		case '0': home = "서울/부산";	break;
		case '1': home = "인천/경기";	break;
		case '2': home = "강원";	break;
		case '3': home = "강원/충북";	break;
		case '4': home = "대전";	break;
		case '9': home = "제주";
		}
		System.out.println(home+" 출신");
		
		String nai = id.substring(0, 2);	// 변수 nai			// index 0~1 까지 자르기
		int sunai = Integer.parseInt(nai);	// 변수 sunai			// 자른 String int 변환
		
		Calendar calendar = Calendar.getInstance();	// 변수 달력		// Calendar.getInstance() 메소드 / 캘린더 리턴
		int year = calendar.get(Calendar.YEAR);		// 변수 연도		// Calendar.get(int field) 메소드 / Calendar.필드 연도리턴
		
		int age = 0;	// 변수 age / 나이
		if(sung == '9' | sung == '0')	age = year - (1800 + sunai) + 1;	// 나이계산
		if(sung == '1' | sung == '2')	age = year - (1900 + sunai) + 1;
		if(sung == '3' | sung == '4')	age = year - (2000 + sunai) + 1;
		
		System.out.println(age);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
