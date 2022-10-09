package chapter06.EX01;

// 같은 패키지 내에서 클래스 이름은 중복되면 오류 발생
/*class A{
	
}*/
class C{
	// 필드 : Heap 영역에 값 저장
	int a;
	int b;
	String name;
	
	// 기본생성자 : 생략가능
	C(){}
	
	// 메서드
	void call() {
		int c;	// 지역변수
		System.out.println("출력");
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
//		System.out.println(c);	// 오류발생 : 값을 초기화 하지 않았다.
	}
}

public class Using_Class_03 {

	public static void main(String[] args) {

		C c = new C();	// 객체 c 생성
		c.call();	// 객체 c의 메서드 호출
		
	}

}
