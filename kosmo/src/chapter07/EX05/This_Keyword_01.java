package chapter07.EX05;

class A{
	int m;
	int n;
	
	// A(){}
	
	void init (int a, int b) {
		int c;
		c = 3;
		m = a;	// This 컴파일러가 자동 할당
		n = b;
	}
	void work() {
		init(2,3);	// This 생략
		System.out.println(m+" , "+n);
	}
}

public class This_Keyword_01 {

	public static void main(String[] args) {
		// This Keyword : 클래스의 필드와 메소드를 사용할 때 컴파일러가 자동으로 할당해준다.
		/// 객체 자신을 뜻한다.
		/// 필드와 메소드를 선언시에는 this 키워드를 사용하면 안된다.
		/// 필드와 메소드가 클래스의 메소드 내에서 사용될 때 컴파일러가 자동으로 할당.
		/// 기본적으로는 생략되어 있다.
		
		// This Method
		/// 클래스 내에서 다른 생성자를 호출
		/// 생성자에서 사용해야 한다.
		/// 생성자내 첫라인에 와야 한다.

		A a = new A();
		a.work();
		
	}

}
