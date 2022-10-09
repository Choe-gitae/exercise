package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {

		int sum = sumFunc(5);
		System.out.println("합:"+sum);
		
	}//main

	static int sumFunc(int i) {
		// sum = 1 + 2 + 3 + 4 + 5
		if(i == 1) return 1;
		
		return i + sumFunc(i-1);	//재귀호출
	}
}
