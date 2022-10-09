package chapter07.EX05;

// 반드시 This 키워드를 사용해야 하는 경우
/// 생성자, 메소드의 매개변수이름, 필드이름이 동일한 경우 필드이름에 this를 명시해야 한다
class AA {
	int m;
	int n;
	
	void init(int m, int n) {
		m = m;
		n = n;
	}
}
class BB {
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class This_Keyword_02 {

	public static void main(String[] args) {

		AA aa = new AA();
		aa.init(10, 20);
		
		BB bb = new BB();
		bb.init(10, 20);
		
		System.out.println(aa.m+" , "+aa.n);
		System.out.println(bb.m+" , "+bb.n);
		
	}

}
