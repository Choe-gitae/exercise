package chapter06.EX01;

// 클래스와 객체의 차이점
//	클래스 : 객체를 만들기 위한 틀 , 붕어빵 기계 , 설계도
///		필드		: 클래스 {} 안쪽에 선언된 변수 (멤버변수)
///		생성자
///		메서드	: 메소드 내부에 선언된 변수 (지역변수)
///		이너클래스
//	객체 : 클래스를 틀로 해서 만들어져 RAM에 로드된 상태 , 붕어빵 , 건물

// 클래스를 객체로 만드는 작업을 인스턴스화 라고 한다.

// 외부클래스
class A{
	// 필드 : Heap 공간에 값 저장
	int m = 3;
	int n = 4;
	
	// 기본생성자 : 클래스이름과 동일한 메서드, 리턴 타입이 없다.
	///		객체를 생성할 때 초기값을 부여하는 역할
	A(){
		
	}
	
	// 메서드 : 호출시 작동
	void print() {
		int k = 10;	//지역변수
		System.out.println(k);
		System.out.println(m+n);
	}
}

// 외부클래스
class B{
	
}

public class Using_Class_02 {

	public static void main(String[] args) {
		
		int i;	//지역변수
		
		// 객체 a 생성
		A a = new A();	// A : 참조변수타입 , a : 객체(참조변수) , A() : 기본생성자 호출
		
		// 객체 a의 필드 출력
		System.out.println(a.m);						// 3
		System.out.println(a.n);						// 4
		
		// 객체 a의 메서드 호출
		a.print();
		
		// 객체 b 생성
		A b = new A();
		
		// 객체 b의 필드 값 수정
		b.m = 30;
		b.n = 40;
		
		// 객체 b의 필드 내용 출력
		System.out.println(b.m);
		System.out.println(b.n);
		
		// 객체 b의 메서드 호출
		b.print();
		
	}

}
