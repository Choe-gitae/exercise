package chapter05.EX04;

public class Using_String_04 {

	public static void main(String[] args) {

		// 1. 문자열 + 문자열
		String str1 = "안녕"+"하세요"+"!";
		System.out.println(str1);								//안녕하세요!
		
		String str2 = "반갑";
		str2 += "습니다";	//str2 = str2 + "습니다"
		str2 += "!";	//str2 = str2 + "!"
		System.out.println(str2);								//반갑습니다!
		
		// 2. 문자열 + 기본자료형
		String str3 = "안녕"+1;	//정수 1이 자동으로 문자열료 변환
		String str4 = "안녕"+String.valueOf(1);	//String.valueOf(1) : 정수 1 String 변환
		String str5 = "안녕"+"1";	// 문자열 + 문자열
		System.out.println(str3);								//안녕1
		System.out.println(str4);								//안녕1
		System.out.println(str5);								//안녕1
		
		// 3. 문자열과 기본자료형 혼용
		System.out.println(1+"안녕");								//1안녕
		System.out.println(1+2+3+"안녕");							//6안녕
		System.out.println("안녕"+1+2+3);							//안녕123
		
	}

}
