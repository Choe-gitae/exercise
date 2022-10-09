package chapter09.EX01;

public class Using_Modifier_01 {

	public static void main(String[] args) {

		A a = new A();
		// 필드 출력
		System.out.println(a.a);	// public
		System.out.println(a.b);	// protected	// 같은 패키지
		System.out.println(a.c);	// default		// 같은 패키지
//		System.out.println(a.d);	// private
		
		// 메소드 출력
		a.print1();					// public
		a.print2();					// protected	// 같은 패키지
		a.print3();					// default		// 같은 패키지
//		a.print4();					// private
		
		E e = new E();
		// 필드 출력
		System.out.println(e.a);	// public
		System.out.println(e.b);	// protected	// 같은 패키지
		System.out.println(e.c);	// default		// 같은 패키지
//		System.out.println(e.d);	// private
		
		// 메소드 출력
		e.print1();					// public
		e.print2();					// protected	// 같은 패키지
		e.print3();					// default		// 같은 패키지
//		e.print4();					// private
	}

}
