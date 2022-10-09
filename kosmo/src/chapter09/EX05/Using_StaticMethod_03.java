package chapter09.EX05;

class C{
	int a;
	static int b;

	// static 초기화 블록
	static {	// 클래스가 메모리에 로딩될 때 실행
//		a = 10;		// 인스턴스 필드 초기화 불가능
		b = 5;
		System.out.println("클래스 C가 로딩 되었습니다.");
	}
	
	C(){
		a = 3;
		b = 55;
	}
}

public class Using_StaticMethod_03 {
	
	int a;
	static int b;
	
	void abc() {
		System.out.println("instance method - abc()");
	}
	static void bcd() {
		System.out.println("static method - bcd()");
	}

	public static void main(String[] args) {

		// 객체 생성없이 static 필드 호출
		System.out.println(C.b);
//		System.out.println(a);		// 인스턴스 필드
		System.out.println(b);
		
		// 객체 생성없이 static method 호출
//		abc();						// 인스턴스 메소드
		bcd();
		
	}

}
