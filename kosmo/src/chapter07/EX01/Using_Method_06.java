package chapter07.EX01;

import java.util.Arrays;

public class Using_Method_06 {

	///// 메서드
	// int 배열의 모든 값을 더해서 리턴
	static int add(int[] a) {
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			temp += a[i];	// 배열을 순환하며 더하기
		}
		
		return temp;
	}
	
	// int 배열의 모든 값을 빼서 리턴
	static int div(int[] a) {
		int temp = a[0];	// 초기값 배열[0] 값
		
		for (int i = 1; i < a.length; i++) {	// 배열[1]부터 반복시작
			temp -= a[i];	// 배열을 순환하며 빼기
		}
		
		return temp;
	}

	// int 배열의 모든 값을 곱해서 리턴
	static long mul(int[] a) {
		long temp = 1;	// int 값 범위를 넘기 때문에 long타입을 사용한다.
		
		for (int i = 0; i < a.length; i++) {
			temp *= a[i];	// 배열을 순환하며 곱하기
		}
		
		return temp;
	}
	
	// int 배열의 모든 값의 평균값 리턴
	static double avg(int[] a) {
		int temp = 0;
		double avg = 0;
		
		for (int i = 0; i < a.length; i++) {
			temp += a[i];	// 배열을 순환하며 더하기
		}
		
		avg = temp/(double)a.length;	// 평균값
		return avg;
	}

	public static void main(String[] args) {

		// 1~100 까지 7의 배수만 배열에 저장후 각 메서드 호출
		/// 배열에 입력
		int[] intArr = new int[100/7];	// int 배열 선언
		for (int i = 7, j = 0; i <= 100; i+=7, j++) {	// 7의 배수 배열 앞부터 입력
			intArr[j] = i;
		}
		System.out.println(Arrays.toString(intArr));	// 입력값 확인출력
		
		/// 메서드 호출 및 출력
		System.out.println("더하기\t: "+add(intArr));
		System.out.println("빼기\t: "+div(intArr));
		System.out.println("곱하기\t: "+mul(intArr));
//		int : 1760012288			long : 4513787149822699520
		System.out.println("평균값\t: "+avg(intArr));
		
	}

}
