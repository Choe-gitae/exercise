package chapter08.EX02;

// import 시 * 를 사용 : 해당 패키지의 모든 클래스 import
// 하위의 패키지는 포함하지 않는다.
import chapter08.EX01.*;

public class Using_Package_04 {
	
	public static void main(String[] args) {
	
		// A 클래스 public
		A a = new A();
		
		// B 클래스 default
//		B b = new B();		// 접근불가
		
		// C 클래스 public
		C c = new C();
		
		// chapter08.EX01.com02.D 클래스
//		D d = new D();		// 하위 패키지는 import 적용이 안된다.
		
	}
	
}
