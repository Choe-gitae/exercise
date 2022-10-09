package chapter04.EX02;

import java.util.Scanner;		//같은 패키지 외부의 객체를 사용할 경우 import가 필요함.

public class Using_Scanner {

	public static void main(String[] args) {
		//Scanner : 첫 글자를 대문자로 시작 : 클래스 (객체를 생성하는 틀)
		/*	- 콘솔을 통해서 값(정수 int, 실수, 문자, 문자열 next() nextln() )을 받아서 처리
		 * 	- 객체를 임포트 해서 사용해야 한다. (import java.util.Scanner)
		 * 	- 공백이나 엔터를 사용해서 여러개의 값을 넣을 수 있다.
		 *  - Scanner 를 사용후에는 sc.close()를 사용해서 객체를 메모리에서 제거
		 */
		
		Scanner sc = new Scanner(System.in);
		//Scanner 클래스로부터 sc객체를 생성 (콘솔을 통해서 input받음)
		// ctr + shift + o : 외부 클래스 자동 import
		
		// sc : 객체 , sc.nextint() : 객체의 메소드(함수)
		System.out.println("정수값을 입력하세요.");
		int a = sc.nextInt();		//콘솔에서 정수값을 받아서 변수에 할당
		System.out.println("변수 a를 출력 : "+a);
		
		System.out.println("문자열을 입력하세요.");
		String b = sc.next();		//콘솔에서 문자열을 받아서 변수에 할당
		System.out.println("변수 b를 출력 : "+b);

		System.out.println("실수값을 입력하세요.");
		double c = sc.nextDouble();	//콘솔에서 실수값을 받아서 변수에 할당
		System.out.println("변수 c를 출력 : "+c);
		
		System.out.println("한문자를 입력하세요.");
		String s = sc.next();
		char d = s.charAt(0);
		System.out.println("변수 d를 출력 : "+d);
		
		sc.close();
	}

}
