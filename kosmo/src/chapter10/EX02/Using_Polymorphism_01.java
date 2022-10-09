package chapter10.EX02;

// 다형성 (Polymorphism) : 하나의 객체가 여러가지 타입을 가질 수 있다.
/// Method Overriding 을 사용해서 부모클래스의 메소드를 재정의 해서 자식클래스에서 재사용한다.


// 상속을 이용한 다형적 표현
/// 상속 관계에서 객체를 생성시 부모 타입으로 선언할 수 있다.
/// 부모 타입으로 선언하면 부모클래스의 필드와 메소드만 사용 가능하다.
/// 자식 객체를 생성 하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 된다.
/// 다시 자식클래스의 필드와 메소드를 사용 할려면 다운캐스팅을 해야한다.
/// 다운캐스팅은 수동으로 적용해야 한다.

class A {}
class B extends A {}
class C extends B {}
class D extends B {}
public class Using_Polymorphism_01 {

	public static void main(String[] args) {

		// 1. A타입의 다형적 표현
		A a1 = new A();		// A는 A이다. (O)
		A a2 = new B();		// B는 A이다. (O)
		A a3 = new C();		// C는 A이다. (O)
		A a4 = new D();		// D는 A이다. (O)
		
	}

}
