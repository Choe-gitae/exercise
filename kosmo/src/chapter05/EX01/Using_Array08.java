package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		// 정수 배열 10개를 생성하고
		// 임의의 값을 입력
		// 그 중 최대값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int max = 0;
		int min = 0;
		
		///// 배열에 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수를 입력하세요.");
			arr[i] = sc.nextInt();
		}
		
		///// 최대값
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		///// 최소값
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		sc.close();
		
		//출력
		System.out.println("배열방에서 최대값은 : "+max);
		System.out.println("배열방에서 최소값은 : "+min);
		
		// 2번째 방법 //////////////////////////////////////////////// 
		// Arrays.sort()
		Arrays.sort(arr);	//배열방의 값을 정렬을 한다. 최소값 ~ 최대값 정렬
		System.out.println("최소값 : "+arr[0]);
		System.out.println("최대값 : "+arr[arr.length-1]);
		
		// 3번째 방법 //////////////////////////////////////////////// 
		// Arrays.stream()
		System.out.println(Arrays.stream(arr).max().getAsInt());	//최대값
		System.out.println(Arrays.stream(arr).min().getAsInt());	//최소값
		
	}

}
