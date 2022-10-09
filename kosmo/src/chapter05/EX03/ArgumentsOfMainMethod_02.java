package chapter05.EX03;

import java.util.Arrays;

public class ArgumentsOfMainMethod_02 {

	public static void main(String[] args) {

		// main method로 값 던져 주기
		//		안녕하세요 3 5.8 10 11 12 태풍 지나감 true false == != && || $
		
		// args.length 출력
		System.out.println(args.length);
		
		// main method로 넘겨진 값을 자동으로 출력하기
		/// for문 사용
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]+" ");
		}
		
		System.out.println();
		/// for each 사용
		for (String a : args) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		/// Arrays.toString()
		System.out.println(Arrays.toString(args));
		
	}

}
