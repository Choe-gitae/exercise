package basic3;

public class Ex03_CallByString {

	public static void main(String[] args) {

		String a = new String("안녕");
		String b = new String("하이");
		
		add(a,b);
		System.out.println("A="+a+", B="+b);	//2 //A=안녕, B=하이
		
	}//main

	static void add(String a, String b) {
		a += b;									//힙영역에 새로 생성후 지역변수 a에 참조값 입력
		System.out.println("A="+a+", B="+b);	//1 //A=안녕하이, B=하이
	}

}
