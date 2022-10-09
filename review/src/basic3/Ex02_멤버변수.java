package basic3;

public class Ex02_멤버변수 {

	static int a = 10, b = 20;
	static int sum = 0;
	
	public static void main(String[] args) {

		add();
		//출력
		System.out.println("합 : "+sum);
		
	}//main

	static void add() {
		//두 수를 더하기
		sum = a+b;
	}//add()
}//class
