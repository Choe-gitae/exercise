package chapter07.EX05;

class Abc {
	Abc(){
		System.out.println("기본생성자 호출");
	}
	Abc(int a){
		this();		// 기본생성자 호출
		System.out.println("두번째 생성자 호출");
	}
	Abc(int a, String b){
		this(30);	// 두번째 생성자 호출
		System.out.println("세번째 생성자 호출");
	}
	Abc(int a, String b, double c){
		this(10,"a");
		System.out.println("네번째 생성자 호출");
	}
}
public class This_Method_01 {

	public static void main(String[] args) {

		// This Method : 클래스 내의 다른 생성자를 호출
		/// 반드시 생성자 내부에서 사용 / 메소드 내부에서 사용불가
		/// 반드시 생성자 첫째줄에 와야 한다.
		
		Abc abc1 = new Abc();
		System.out.println("===================");
		Abc abc2 = new Abc(5);
		System.out.println("===================");
		Abc abc3 = new Abc(10,"string");
		System.out.println("===================");
		Abc abc4 = new Abc(10,"string",0.0);
		
	}

}
