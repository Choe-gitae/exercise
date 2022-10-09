package chapter10.EX05;

// Method Overloading
/// 메소드 이름이 동일 하더라도 시그니쳐가 다른 경우 다른 메소드로 식별
/// 시그니쳐 : 입력매개변수 타입 , 입렵매개변수 갯수

// Method Overriding : 상속관계만 사용가능
/// 부모의 메소드를 자식클래스에서 새롭게 재정의해서 사용한다.
/// 부모의 메소드를 삭제하는 것이 아니다. 올라타는 개념
/// Overriding 조건
//// 1. 리턴타입이 같아야 한다.
//// 2. 메소드명과 시그니쳐가 같아야 한다.
//// 3. 접근지정자가 같거나 더 넓어야 한다.

// @ : Annotation
/// @Override : 자식클래스에서 메소드 오버라이딩할 때 오류를 방지하는 기능

class A{
	void print() {
		System.out.println("A Class Output");
	}
}
class B extends A{
	@Override		// 오류방지 구문
	void print() {
		System.out.println("B Class Output");
	}
}


public class Using_Method_Overriding_01 {

	public static void main(String[] args) {

		// 1. A타입 A객체 생성
		A a1 = new A();
		a1.print();
		
		// 2. B타입 B객체 생성
		/// A Class 생성 -> B Class 생성하는 과정에서 Overriding
		B b1 = new B();
		b1.print();
		
		// 3. A타입 B객체 생성
		/// A Class 생성 -> B Class 생성하는 과정에서 Overriding
		A a2 = new B();
		a2.print();
		
	}

}
