package chapter09.EX01;

public class E extends A{
	
	public void print() {
		
		// 필드 출력
		System.out.println(a);		// A 클래스 필드 a public
		System.out.println(b);		// A 클래스 필드 b protected	// 같은 패키지
		System.out.println(c);		// A 클래스 필드 c default		// 같은 패키지
//		System.out.println(d);		// A 클래스 필드 d private
		
		// 메소드 출력
		print1();					// A 클래스 메소드 public
		print2();					// A 클래스 메소드 protected	// 같은 패키지
		print3();					// A 클래스 메소드 default		// 같은 패키지 
//		print4();					// A 클래스 메소드 private
	}
	
}
