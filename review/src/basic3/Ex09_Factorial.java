package basic3;

public class Ex09_Factorial {

	public static void main(String[] args) {

		int factorial = factorial(5);
		System.out.println("! = "+factorial);
		
	}//main

	static int factorial(int i) {
		if(i == 1) return 1;
		return i * factorial(i-1);
	}
}
