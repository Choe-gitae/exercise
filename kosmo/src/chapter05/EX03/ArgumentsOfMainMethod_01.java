package chapter05.EX03;

public class ArgumentsOfMainMethod_01 {

	public static void main(String[] args) {

		// main Method 에 입력매개변수 전달 하기		(객체지향언어) Method = 함수
		//	- 메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수) {실행부...}
		
		///// 메인 메소드의 입력매개변수 args[i] 값을 받아서 변수에 할당
		//// 안녕하세요 3 5.8
		String a = args[0];
		String b = args[1];		
		String c = args[2];
		
		///// 출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		///// 연산
		System.out.println(b+1);	// String + int = 31	연결연산자
		System.out.println(c+1);	// String + int = 5.81	연결연산자
		
		///// 숫자형식 String => 정수, 실수 변환
		////	Integer.parseInt(string)
		////	Double.parseDouble(string)
		
		///// 연산
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		///// 출력
		System.out.println(d+1);	// int + int = 4		덧셈연산자
		System.out.println(e+1);	// double + int = 6.8	덧셈연산자
		
	}

}
