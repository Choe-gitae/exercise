package chapter05.EX01;

import java.util.Arrays;

public class Using_Array02 {

	public static void main(String[] args) {
		// 배열 Array
		//	- 참조변수를 선언후 초기화 하면 값이 자동 등록
		//	- 정수 : 0	실수 : 0.0	String : null	boolean : false
		
		// 1. 배열 선언 및 초기화
		double[] d = new double[6];
		
		// 2. 배열의 값을 할당
		d[0] = 10.5;
		d[1] = 20.5;
		d[2] = 30.5;
		d[3] = 40.5;
		d[4] = 50.5;
		d[5] = 60.5;

		// 3. 배열의 값을 출력
		System.out.println(d[2]);
		
		System.out.println("=====for문 사용=====");
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("=====향상된 for문 사용=====");
		for (double i : d) {
			System.out.println(i);
		}
		
		System.out.println("=====Arrays.toString 사용=====");
		System.out.println(Arrays.toString(d));
		
		
		
	}

}
