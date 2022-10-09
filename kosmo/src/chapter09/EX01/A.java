package chapter09.EX01;

// 클래스의 접근지정자 : public , default

// 필드, 생성자, 메소드 : public , protected , default , private
/// public 		: 동일 패키지의 모든 클래스, 다른 패키지 모든 클래스 사용가능
/// protected	: 동일 패키지의 모든 클래스, 다른 패키지의 자식클래스에서 사용가능
/// default 	: 동일 패키지의 모든 클래스 사용가능
/// private 	: 동일 클래스에서 사용가능

public class A {
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void print1() {
		System.out.println("A 클래스 출력 - public");
	}
	protected void print2() {
		System.out.println("A 클래스 출력 - protected");
	}
	void print3() {
		System.out.println("A 클래스 출력 - default");
	}
	private void print4() {
		System.out.println("A 클래스 출력 - private");
	}
}
