package chapter08.EX01;

// default : 같은 패키지 내에서만 접근 가능, 다른 패키지 접근 불가
class B {
	int a = 10;
	int b = 20;
	
	void print() {
		System.out.println("B 클래스 접근");
	}
}
