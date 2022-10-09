package chapter07.EX01;

import java.util.Arrays;

public class Using_Method_05 {

	// 입력 받은 int 배열 출력
	static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	// 입력 받은 String 배열 출력
	static void printArrayString(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		// 배열을 매개변수로 가지는 메서드
		int[] a = new int[] {1,2,3};
		
		Using_Method_05.printArray(a);	// 방법1
		printArray(a);					// 방법2
		printArray(new int[] {4,5,6});	// 방법3
//		printArray({7,8,9});	// 오류발생
		
		String[] s = new String[] {"안녕","하세요","내일은","연휴","입니다"};
		
		Using_Method_05.printArrayString(s);	// 방법1
		printArrayString(s);					// 방법2
		printArrayString(new String[] {"추석","늘어지게","쉬어야지","개꿀"});	// 방법3
//		printArrayString({"추석","늘어지게","쉬어야지","개꿀"});	// 오류발생
		
	}

}
