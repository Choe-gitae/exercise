package chapter09.EX03;

// 외부 클래스
/// 동일 패키지 내에서 사용 가능
/// 외부 패키지에서 사용 불가능
/// 외부 패키지에서 사용 할려면 별도의 public 클래스로 생성해야 한다.
class A{	// 접근 지정자 default
	int m = 10;
	int n = 20;
	
	void print() {
		System.out.println(m+" , "+n);
	}
}

public class Using_Modifier_10 {

	public static void main(String[] args) {

		A a = new A();
		a.print();
		
		B b = new B();
		b.print();
		
	}

}
