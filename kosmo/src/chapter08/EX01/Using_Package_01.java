package chapter08.EX01;

public class Using_Package_01 {

	public static void main(String[] args) {
		
		// 같은 패키지에 존재 : import 없이 바로 접근 가능
		// A 클래스 접근지정자 : public
		A a = new A();
		a.print();
		System.out.println(a.m);
		System.out.println(a.n);
		
		// 같은 패키지에 존재 : import 없이 바로 접근 가능
		// B 클래스 접근지정자 : default
		B b = new B();
		b.print();
		System.out.println(b.a);
		System.out.println(b.b);
		
		// chapter08.EX01.com.A 클래스 접근지정자 : public
		chapter08.EX01.com.A aa = new chapter08.EX01.com.A();
		aa.print();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
	}

}
