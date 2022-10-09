package chapter05.EX01;

import java.util.Arrays;

public class Using_Array04 {

	public static void main(String[] args) {
		// 배열(Array) : 하나의 [배열]변수에 여러개의 값을 넣는다.
		//		- 참조자료형 : 변수는 Stack에 저장, 값은 Heap에 저장
		//			변수에 Heap 영역의 주소값이 들어있다.
		//		- 기본자료형 : 변수, 값 모두 Stack에 저장되어 있다.
		//			boolean, byte, short, int, long, float, double, char
		//	기본자료형 배열 변수 : 
		//	참조자료형 배열 변수 : String
		
		// 1. 동일한 자료형의 값을 담고 있다.
		// 2. 방의 갯수를 변경할 수 없다. (정적)
		
			//Heap 공간에는 반드시 값이 들어 있어야 한다.
			//	- 초기값을 넣지 않는 경우 JVM이 자동으로 넣는다.
			//		-- 정수:0 , 실수:0.0 , boolean:false
		
		//1. 배열 선언과 초기화
		int[] a = new int[5];	//int 배열변수 a를 생성	//new : Heap공간에 int배열방 5개 생성 및 초기화
		
		//2. 배열에 값을 입력
		//Index 사용
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//for문 사용 값 대입
		for (int i = 0, j = 100; i < a.length; i++, j+=100) {
			a[i] = j;
		}
		
		//3. 배열 방의 정보를 출력
		System.out.println("=====Index");
		System.out.println(a[0]);	//index (방번호0)
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("=====for문");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=====for each");
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("=====Arrays.toString(a)");
		System.out.println(Arrays.toString(a));
		

	}

}
