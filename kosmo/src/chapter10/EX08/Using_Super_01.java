package chapter10.EX08;

// Super Keyword : 상속 관계에서 부모클래스(Super Class)의 필드 , 메소드 호출
// Super Method  : 상속 관계에서 부모클래스(Super Class)의 생성자를 호출
/// 생성자 내부에서 사용 , 반드시 첫 라인에 와야 한다.

class A {
	void abc() {
		System.out.println("A Class abc()");
	}
}
class B extends A {
	@Override
	void abc() {
		System.out.println("B Class abc()");
	}
	void bcd() {
		abc();			// this.abc()
		super.abc();	// 부모클래스 abc()
	}
}

public class Using_Super_01 {

	public static void main(String[] args) {

		// 1. 객체 생성
		B b = new B();
		
		// 2. 메소드 호출
		b.bcd();
		
	}

}
