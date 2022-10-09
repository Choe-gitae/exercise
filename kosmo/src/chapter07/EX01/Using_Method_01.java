package chapter07.EX01;

class B{
	
	// 1. 리턴 타입이 없고 , 입력매개변수가 없는 메서드
	void print() {
		System.out.println("안녕");
	}
	
	// 2. 리턴 타입 int , 입력매개변수가 없는 메서드
	int data() {
		return 3;	// 3 반환
	}
	
	// 3. 리턴 타입 double , 입력매개변수 2개인 메서드
	double sum(int a, double b) {
		return a + b;	// 입력매개변수 2개 더한 뒤 반환
	}
	
	// 4. 리턴 타입 없음 , 내부 함수 종료
	void print(int m) {	// 오버로딩
		if(m < 1 || m > 12) {	// != 1~12 
			System.out.println("잘못된 입력");
			return;	// 메서드 종료
		}
		System.out.println(m+"월 입니다.");
	}
	
	boolean call() {
		return true;
	}
}

public class Using_Method_01 {

	public static void main(String[] args) {

		B b = new B();	// 객체 b 생성
		b.print();	// 메서드 print() 호출				// 안녕
		System.out.println(b.data());				// 3
		System.out.println(b.sum(1, 5.8));			// 6.8
		b.print(6);									// 6월 입니다.
		b.print(0);									// 잘못된 입력
		System.out.println(b.call());				// true
		
	}

}
