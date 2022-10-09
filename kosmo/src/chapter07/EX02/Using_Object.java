package chapter07.EX02;

// 클래스 외부 3가지
//	1. 패키지
//	2. 임포트(같은 패키지에 존재하지 않는 클래스)
//	3. 외부클래스

class A {	// 클래스 A
	// 클래스 내부 4가지
	/// 1. 필드
	int m;
	int n;
	double k;
	String str;
	
	/// 2. 생성자 : 클래스 이름과 동일 , 리턴이 존재하지 않는다
	//// 기본 생성자는 생략되어 있을 경우 컴파일러가 자동으로 만들어 준다
	//// 클래스 내부의 다른 생성자가 존재하면 컴파일러가 자동으로 만들어 주지 않는다
	A(){	// 기본 생성자
		System.out.println("기본 생성자 호출");
	}
	
	/// 3. 메서드 : 리턴타입 메서드명 (입력매개변수) {실행코드 ;}
	//// 프로그램의 기능을 담당한다
	//// 호출해서 작동 : 메서드명 (입력매개변수)
	void work1() {
		System.out.println("work1 메서드 호출");
	}
	
	int work2(int a, int b) {
		System.out.println("work2 메서드 호출");
		return a+b;
	}
	
	double work3(int a, double b, String c) {
		System.out.println("work3 메서드 호출");
		System.out.println(a+" , "+b+" , "+c);
		return a+b;
	}
	
	String work4(String a) {
		return a;
	}
	
	/// 4. 이너클래스
}

public class Using_Object {

	public static void main(String[] args) {

		A a1 = new A();	// 객체 생성
		// A : 클래스
		// a1 : 객체명
		// new : 힙 공간에 생성
		// A() : 클래스 내부 생성자 호출
		A a2 = new A();
		A a3 = new A();
		
		// 객체의 필드값 출력
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.str);
		
		// 객체의 필드값 수정
		a1.m = 10;
		a1.n = 20;
		a1.k = 30.0;
		a1.str = "안녕하세요";
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.str);
		
		// 메서드 호출
		a1.work1();
		
		int i = a1.work2(10, 20);
		System.out.println(i);
		System.out.println(a1.work2(40, 50));
		
		double d = a1.work3(100, 33.3, "오늘");
		System.out.println(d);
		System.out.println(a1.work3(123, 45.6, "내일"));
		
		String str = a1.work4("안녕");
		System.out.println(str);
		System.out.println(a1.work4("안녕하세요"));
		
	}

}
