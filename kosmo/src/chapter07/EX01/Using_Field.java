package chapter07.EX01;

class A{
	// 필드
	int m = 3;
	int n = 4;
	
	// 기본생성자 생략
	// 메서드
	void work1() {
		int k = 5;	// 지역변수
		System.out.println(k);
		work2(3);	// work2() 메서드 호출
	}
	
	void work2(int i) {
		int j = 4;
		System.out.println(i+j);
	}
	
}

public class Using_Field {

	public static void main(String[] args) {

		// 객체 a 생성
		A a = new A();
		
		// 필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		
		// 메서드 호출
		a.work1();
		
	}

}
