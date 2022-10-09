package chapter05.EX01;

import java.util.Arrays;

public class Using_Array01 {

	public static void main(String[] args) {
		//기본 자료형인 경우 : RAM Stack 영역에 변수와 값이 같이 저장
		//참조 자료형인 경우 : RAM Stack 영역에 변수명 저장, Heap 영역에 변수값 저장
		//배열(Array) : 하나의 [배열] 변수에 여러개의 값을 할당
		//	- 동일한 자료형의 값을 할당
		//	- 배열의 방의 크기를 지정하면 수정이 불가능
		
		int[] a = new int[5];	//배열 a의 변수에 주소값 할당	//new int[5] : Heap 영역에 int형 공간(객체) 생성
		
		a[0] = 10;	//Heap영역 index[0]번에 정수 10 할당
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//배열 index를 사용하여 값을 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//for문을 사용해서 출력
		System.out.println("=====for문을 사용 배열출력=====");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("배열 a의 길이 : "+a.length);	// a.length : 배열 a의 공간갯수
		
		System.out.println("=====for문에서 a.length 사용 배열출력=====");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=====변수 a Heap주소값=====");
		System.out.println(a);	//Heap 주소값
		
		//향상된 for문으로 배열의 모든값을 출력
		//	- 배열의 모든값을 한꺼번에 출력
		System.out.println("=====향상된(enhanced) for문으로 배열출력=====");
		for(int i : a) {
			System.out.println(i);
		}
		
		//Array.toString(a) 로 배열출력
		System.out.println("=====Arrays.toString(a)=====");
		System.out.println(Arrays.toString(a));
		
		
		
		
		
	}

}
