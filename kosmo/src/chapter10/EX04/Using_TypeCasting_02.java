package chapter10.EX04;

class A{
	int a = 10;
	void a() {
		System.out.println("A Class Output");
	}
}
class B extends A{	// 자식클래스 객체를 생성시 부모클래스의 기본 생성자를 호출후 자식클래스 생성
	int b = 20;
	void b() {
		System.out.println("B Class Output");
	}
}
class C extends B{
	int c = 30;
	void c() {
		System.out.println("C Class Output");
	}
}

public class Using_TypeCasting_02 {

	public static void main(String[] args) {

		// 다형성 : 하나의 객체가 여러 타입으로 정의해서 사용가능
		
		System.out.println("==================== 1");
		// 1. A타입으로 A객체를 생성
		/// A Class 생성 , A Class 참조
		A a1 = new A();
		a1.a();
		System.out.println(a1.a);
		
		System.out.println("==================== 2");
		// 2. B타입으로 B객체를 생성
		/// A Class 생성 -> B Class 생성 , B Class 참조
		B b1 = new B();
		b1.a();
		b1.b();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		/// A타입으로 업캐스팅
		//// A Class 참조
		A a2 = b1;
		a2.a();
		System.out.println(a2.a);
		
		/// B타입으로 다운캐스팅
		//// B Class 참조
		B b2 = (B)a2;
		b2.a();
		b2.b();
		System.out.println(b2.a);
		System.out.println(b2.b);
		
		// 업캐스팅은 구문에서 오류 발생
		// 다운캐스팅은 구문에서 오류가 발생하지 않는다. 실행시 오류 발생
		/// instanceOf 를 사용해서 오류가 발생하지 않도록 처리가 필요하다.
		if(b1 instanceof C) {	// b1 객체에 C Class 타입을 내포하고 있을때 True 리턴
			C c1 = (C)b1;
		}else {
			System.out.println("b1 객체는 C타입을 내포하고 있지 않습니다.");
		}
		
		if(b1 instanceof A) {	// b1 객체가 A Class 타입을 내포하고 있을때 True 리턴
			A a10 = b1;
			System.out.println("A 타입을 내포하고 있습니다.");
		}else {
			System.out.println("A 타입을 내포하고 있지 않습니다.");
		}
		
		System.out.println("==================== 3");
		// 3. A타입으로 C객체를 생성
		/// A Class 생성 -> B Class 생성 -> C Class 생성 , A Class 참조
		A a20 = new C();
		a20.a();
		System.out.println(a20.a);
		
		// 다운캐스팅을 할때는 instanceOf 를 사용해야 한다.
		/// A => B 타입으로 다운캐스팅
		if(a20 instanceof B) {
			B b30 = (B)a20;
			b30.a();
			b30.b();
			System.out.println(b30.a);
			System.out.println(b30.b);
		}
		/// A => C 타입으로 다운캐스팅
		if(a20 instanceof C) {
			C c30 = (C)a20;
			c30.a();
			c30.b();
			c30.c();
			System.out.println(c30.a);
			System.out.println(c30.b);
			System.out.println(c30.c);
		}

	}

}
