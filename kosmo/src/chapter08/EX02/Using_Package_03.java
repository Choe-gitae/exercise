package chapter08.EX02;

// import 사용하지 않고 외부 패키지 접근 : 클래스의 전체 이름 사용 (패키지명 + 클래스명)
/// A 클래스 public , B 클래스 default

public class Using_Package_03 {

	public static void main(String[] args) {

		// A 클래스 접근지정자 : public
		chapter08.EX01.A a = new chapter08.EX01.A();
		a.print();
		System.out.println(a.m);
		System.out.println(a.n);

		// B 클래스 접근제어자 : default
//		chapter08.EX01.B b = new chapter08.EX01.B();	// 접근지정자 default 오류
		
	}

}
