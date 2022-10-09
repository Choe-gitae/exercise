package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		add(a, b);
		
	}//main
	
	static void add(int a, int b) {
		// a + b
		int sum = a + b;
		System.out.println("합 : "+sum);
	}//add

}//class
