package chapter07.EX01;

import java.util.Arrays;

public class Using_Method_08 {

	///// 가변길이 배열 매개변수
	static void method1(int...value) {	// 가변길이 배열 입력 매개변수
//		for (int i = 0; i < value.length; i++) {	// for문 사용 출력
//			System.out.print(value[i]);
//		}
//		System.out.println();
		
//		for (int i : value) {	// for each문 사용 출력
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		System.out.println(Arrays.toString(value));	// Arrays.toString() 사용 출력
		
	}
	
	static void method2(String...value) {
//		for (int i = 0; i < value.length; i++) {
//			System.out.print(value[i]+" ");
//		}
//		System.out.println();
		
//		for (String string : value) {
//			System.out.print(string+" ");
//		}
//		System.out.println();
		
		System.out.println(Arrays.toString(value));
		
	}
	
	
	public static void main(String[] args) {

		// 가변길이 배열 매개변수 (FlexableSizeArray Argument)
		
		method1(1,2);
		method1(1,2,3,4,5);
		
		method2("강감찬","이순신","홍길동");
		method2("호랑이","토끼","사막여우");
		method2("금붕어","가문치","잉어","악어","피라냐");
		
		
		
	}

}
