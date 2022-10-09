package chapter07.EX03;

class A{
	// 1. 필드
	int m;
	
	// 2. 생성자 생략
	/// 컴파일러가 자동으로 기본생성자를 만든다
	
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
}

class B{
	// 1. 필드
	int m;
	
	// 2. 생성자
	B(){}
	
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
}

class C{
	// 1. 필드
	int m;
	
	// 2. 생성자
	/// 생성자가 존재하면 컴파일러는 기본생성자를 만들지 않는다.
	C(int a){
		m = a;
	}
	
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
	
}

public class Using_Constructor_01 {
	
	public static void main(String[] args) {

		A a = new A();	// 기본 생성자 호출 객체생성
		System.out.println(a.m);
		a.work();
		
		B b = new B();
		System.out.println(b.m);
		b.work();
		
//		C c = new C();	// 오류발생 : 기본생성자가 없다
		C c = new C(25);
		System.out.println(c.m);
		c.work();
		
	}

}
