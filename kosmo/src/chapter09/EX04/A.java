package chapter09.EX04;

// static 제어자 : 필드, 메소드 앞에 사용
/// 객체 생성없이 사용가능
/// 모든 객체에서 공유되는 필드

// 인스턴스 필드 : Heap 영역에 객체 생성시 만들어진다.
// 정적 필드 : 클래스 영역의 내부에 저장공간이 있다. Heap 영역 객체 내부의 정적필드는 참조값을 가지고 있다.

public class A {
	int m = 3;			// 인스턴스 필드 : 객체 생성후 사용가능
	static int n = 5;	// 정적(static) 필드 : 객체 생성없이 사용가능, 모든 객체가 공유하는 필드
	
	void print() {
		System.out.println(m+" , "+n);
	}
}
