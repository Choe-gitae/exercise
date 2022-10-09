package chapter09.EX02;

import chapter09.EX01.A;	// 다른 패키지 import

public class Using_Modifier_02 {
	
	public static void main(String[] args) {
		
		A a = new A();
		// 필드 출력
		System.out.println(a.a);	// public
//		System.out.println(a.b);	// protected	// 상속 X
//		System.out.println(a.c);	// default		// 다른 패키지
//		System.out.println(a.d);	// private
		
		// 메소드 출력
		a.print1();					// public
//		a.print2();					// protected	// 상속 X
//		a.print3();					// default		// 다른 패키지
//		a.print4();					// private
		
	}

}
