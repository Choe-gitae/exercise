package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1 ~ 500 까지 3의 배수를 배열에 저장
		// 출력 : 1.직접출력, 2.for, 3.for each, 4.toString()
		// 합계 :		평균 :
		
		int sum = 0;	//합계변수
		int count = 0;	//Heap영역 크기확인용 변수
		
		for (int i = 1; i < 500; i++) {	//500번 반복
			if(i%3 == 0) {	//3의 배수
				count++;	//Heap영역 크기확인
			}
		}
		
		int[] arr = new int[count];	//Heap영역 크기지정
		
		for (int i = 0, j = 3; i < arr.length; i++, j+=3) {	//배열크기 만큼 반복 //증감식 3배수
				arr[i] = j;	//index 증가시키며 3배수 입력
				sum += j;	//합계값 입력
		}
		
		//직접출력
		System.out.println("=====1.직접출력");
		System.out.println(arr[0]);
		
		//for
		System.out.println("=====2.for");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//for each
		System.out.println("=====3.for each");
		for (int i : arr) {
			System.out.println(i);
		}
		
		//Arrays.toString()
		System.out.println("=====4.toString()");
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : "+sum+"\t평균 : "+sum/(double)arr.length);
		
	}

}
