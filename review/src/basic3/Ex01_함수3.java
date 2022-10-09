package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {

		int[] arr = add();
		// a와 b의 값을 받아서 합하고 출력
		int sum = arr[0] + arr[1];
		System.out.println("합 : "+sum);
		
	}//main

	static int[] add() {
		int a = 10, b = 20;
		int[] arr = {a, b};
		return arr;
	}//add()
}//class
