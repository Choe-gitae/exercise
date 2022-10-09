package chapter09.EX04;

public class Test_A {

	public static void main(String[] args) {

		// 객체 생성후 출력
		A a1 = new A();
		System.out.println(a1.m);	// 인스턴스 필드
		System.out.println(a1.n);	// 정적필드
		
		// 객체 생성없이 출력
//		System.out.println(A.m);	// 인스턴스 필드(객체 생성후 사용가능)
		System.out.println(A.n);	// 정적필드
		
		// 정적 필드는 모든 객체에서 공유하는 필드 (클래스 영역 내부에 저장공간이 있다)
		A a2 = new A();
		a2.m = 20;
		a2.n = 2000;
		A a3 = new A();
		a3.m = 30;
		a3.n = 3000;
		A a4 = new A();
		a4.m = 40;
		a4.n = 4000;
		/// 필드 출력 : 정적필드 공유
		a2.print();
		a3.print();
		a4.print();
		
		
	}

}
