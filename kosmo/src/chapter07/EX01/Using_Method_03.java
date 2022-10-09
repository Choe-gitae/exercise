package chapter07.EX01;

public class Using_Method_03 {

	// 인스턴스 필드 : static 키워드가 붙지 않은 필드 (객체화를 해야 사용가능)
	int b;
	int c;
	
	// static 필드 : 객체화 하지 않고 바로 사용가능
	static int d;
	static int e;
	
	// 인스턴스 메서드 : 객체화 해야만 사용가능
	void abc() {
		System.out.println("abc() 메서드 호출");
	}
	
	// static 메서드 : 객체화 없이 사용 가능
	static void def() {
		System.out.println("def() 메서드 호출");
	}
	
	// 필드명 , 메서드명 앞에 static 키워드가 적용되어 있으면 객체 생성없이 호출
	//	static 메서드 내에서는 인스턴스 필드나, 인스턴스 메서드를 바로 사용할 수 없다. (객체화 시켜야 사용 가능)
	public static void main(String[] args) {

		// main 도 method 이다
		int a;	// 지역변수
		a = 10;
		System.out.println(a);	// 지역변수 초기화 하지 않고 출력시 오류발생
		
		// main 메서드 내부에 메서드 선언 불가
		// 메서드는 클래스 블락에서 선언해야 한다.
//		void abc() {
//			System.out.println("안녕하세요");
//		}
		
//		c = 5;		// 오류발생 (static 메서드 내부에서 인스턴스 필드 직접 호출 불가)
		e = 20;		// 같은 클래스 내에서 바로 호출
		
//		abc();		// 오류발생 (static 메서드 내부에서 인스턴스 메서드 직접 호출 불가)
		def();		// 같은 클래스 내에서 바로 호출
		
	}

}
