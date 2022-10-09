package chapter07.EX01;

public class Using_Method_07 {
	
	static void print() {
		System.out.println("매개변수 없음");
	}
	
	static void print(int a) {
		System.out.println(a+" 매개변수:정수");
	}
	
	static void print(double a) {
		System.out.println(a+" 매개변수:실수");
	}
	
	static void print(double a, double b) {
		System.out.println(a+" , "+b+" 매개변수:실수, 실수");
	}
	
	static void print(int a, int b) {
		System.out.println(a+" , "+b+" 매개변수:정수, 정수");
	}
	
	static void print(int a, double b) {
		System.out.println(a+" , "+b+" 매개변수:정수, 실수");
	}

	public static void main(String[] args) {

		// 메소드 오버로딩 (Method Overloading)
		/// 이름이 동일한 메소드의 시그니쳐가 다른 경우 다른 메소드로 인식한다.
		//// 시그니쳐(식별자) : 메소드명, 입력매개변수 타입, 입력매개변수 갯수
		///// 리턴 타입은 시그니쳐가 아니다.
		
		// 메소드 오버라이딩 (Method Overriding)
		/// 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의해서 사용하는 것.
		
		print();
		print(10);
		print(22, 25);
		print(3.141592);
		print(3.14, 112358.13);
		print(2, 5.6);
		
	}

}
