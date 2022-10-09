package chapter05.EX01;

public class Using_Array07 {

	public static void main(String[] args) {
		//배열 변수의 값 대입 방법 
		// 1.배열 선언 - 초기화 - 값 대입
		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 6;
		arr1[2] = 9;
		
		int[] arr11;
		arr11 = new int[3];
		
		// 2.배열 선언과 동시에 값 대입
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i : arr2) {
			System.out.println(i);
		}
		
		int[] arr22;
		arr22 = new int[] {22,33,44,55};
		
		// 3.new int[] 생략
		int[] arr3 = {11,12,13,14,15};
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//int[] arr33;
		//arr33 = {133,144,155};	//오류 발생

	}

}
