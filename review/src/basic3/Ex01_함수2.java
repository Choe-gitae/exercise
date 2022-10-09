package basic3;

public class Ex01_함수2 {

	public static void main(String[] args) {

		int sum = add();
		//합 출력
		System.out.println("합 : "+sum);
		
	}//main

	static int add() {
		int a = 10, b = 20;
		int sum = a+b;
		return sum;
	}//add()
}//class
