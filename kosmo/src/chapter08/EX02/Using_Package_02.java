package chapter08.EX02;

// import 사용 외부클래스 접근
import chapter08.EX01.A;

public class Using_Package_02 {
	
	public static void main(String[] args) {
		
		// 다른 패키지에 존재 : import
		// A 클래스 접근지정자 : public
		A a = new A();
		a.print();
		System.out.println(a.m);
		System.out.println(a.n);
		
		// B 클래스 접근제어자 : default
//		B b = new B();		// 접근지정자 때문에 오류
		
	}
	
}
