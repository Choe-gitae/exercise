package chapter09.EX05;

class B{
	int a = 10;
	static int b = 20;
	
	// 인스턴스 메소드 : 인스턴스 필드, 인스턴스 메소드 , 정적 필드 , 정적 메소드 사용가능
	void abc() {
		System.out.println("instance method - abc()");
		System.out.println(a);	// 인스턴스 필드
		System.out.println(b);	// 정적 필드
		cde();					// 인스턴스 메소드
		def();					// 정적 메소드
	}
	// 정적 메소드 : 정적 필드 , 정적 메소드 사용가능
	static void bcd() {
		System.out.println("static method - bcd()");
//		System.out.println(a);	// 인스턴스 필드
		System.out.println(b);	// 정적 필드
//		cde();					// 인스턴스 메소드
		def();					// 정적 메소드
	}
	void cde() {
		System.out.println("instance method - cde()");
	}
	static void def() {
		System.out.println("static method - def()");
	}
}

public class Using_StaticMethod_02 {

	public static void main(String[] args) {

		// 객체 생성없이 바로 호출
//		System.out.println(B.a);	// 인스턴스 필드
		System.out.println(B.b);
//		B.abc();					// 인스턴스 메소드
		B.bcd();
//		B.cde();					// 인스턴스 메소드
		B.def();
		
		// 객체 생성 후 호출
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		b.bcd();
		b.cde();
		b.def();
		
	}

}
