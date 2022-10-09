package chapter09.EX05;

// 인스턴스 메소드 : 객체 생성 후 호출가능
// 정적 메소드 : 객체 생성 없이 호출가능

class A{
	void abc() {
		System.out.println("인스턴스 메소드 abc()");
	}
	static void bcd() {
		System.out.println("정적 메소드 bcd()");
	}
}

public class Using_StaticMethod_01 {

	public static void main(String[] args) {

		// 정적 메소드 객체 생성 없이 바로 호출 [클래스명.메소드명()]
//		A.abc();		// 불가능 : 인스턴스 메소드는 객체 생성 후 호출 가능하다.
		A.bcd();
		
		// 객체 생성 후 호출 (권장하지 않음)
		A a = new A();
		a.abc();		// 인스턴스 메소드
		a.bcd();		// 정적 메소드
	}

}
