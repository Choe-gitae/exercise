package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		// 1 ~ 1000 까지 배열에 저장후
		// 배열 선언
		// [입력] for문을 사용해서 배열변수에 값을 할당
		// [출력] for문을 사용해서 배열 출력
		// [출력] Enhanced For문을 사용해서 배열 출력
		// [출력] Arrays.toString() 사용해서 배열 출력
		
		///// 배열 선언 및 생성
		int[] arr = new int[1000];	
		
		///// 배열에 1 ~ 1000 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		///// for문 사용 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		///// Enhanced For문을 사용 출력
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		///// Arrays.toString 사용 출력
		System.out.println(Arrays.toString(arr));

	}

}
