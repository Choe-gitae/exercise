package chapter09.EX02;

import chapter09.EX01.A;	// 다른 패키지 import

public class D extends A{
	
	public void print() {
		// 필드 출력
		System.out.println(a);		// A 클래스 필드 a public
		System.out.println(b);		// A 클래스 필드 b protected	// 상속
//		System.out.println(c);		// A 클래스 필드 c default		// 다른 패키지 
//		System.out.println(d);		// A 클래스 필드 d private
		
		// 메소드 출력
		print1();					// A 클래스 메소드 public
		print2();					// A 클래스 메소드 protected	// 상속
//		print3();					// A 클래스 메소드 default		// 다른 패키지 
//		print4();					// A 클래스 메소드 private
		
		D d = new D();		// 객체 생성
		// 필드 출력
		System.out.println(d.a);		// A 클래스 필드 a public
		System.out.println(d.b);		// A 클래스 필드 b protected	// 상속
//		System.out.println(d.c);		// A 클래스 필드 c default		// 다른 패키지 
//		System.out.println(d.d);		// A 클래스 필드 d private
		
		// 메소드 출력
		d.print1();					// A 클래스 메소드 public
		d.print2();					// A 클래스 메소드 protected	// 상속
//		d.print3();					// A 클래스 메소드 default		// 다른 패키지 
//		d.print4();					// A 클래스 메소드 private
	}
	
}
