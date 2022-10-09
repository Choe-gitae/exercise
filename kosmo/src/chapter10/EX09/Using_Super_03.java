package chapter10.EX09;

// this()  : 객체 자신의 생성자 호출, 생성자 내부의 첫 라인에 위치
// super() : 상속관계, 부모클래스의 생성자 호출, 생성자 내부 첫 라인에 위치
/// 자식클래스는 생성자 내부에 첫 라인에 this() , super() 둘 중 하나는 반드시 명시해야 한다.
/// 생략 할 경우 컴파일러가 super() 를 추가한다.

class A{
	A(){
		this(3);
		System.out.println("A Class 기본생성자 - A()");
	}
	A(int a){
		System.out.println("A Class 생성자 - A(int a)");
	}
}
class B extends A{
	B(){
		this(3);
		System.out.println("B Class 기본생성자 - B()");
	}
	B(int a){
		System.out.println("B Class 생성자 - B(int a)");
	}
}


public class Using_Super_03 {

	public static void main(String[] args) {

		// 객체 생성
		A a = new A();
		System.out.println();
		
		A aa = new A(5);
		System.out.println();
		
		B b = new B();
		System.out.println();
		
		B bb = new B(5);
		
	}

}
