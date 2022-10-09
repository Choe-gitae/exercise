package chapter05.EX04;

import java.util.Arrays;

public class Using_String_03 {

	public static void main(String[] args) {

		// String vs 다른 참조자료형 비교
		// String에 저장된 값은 수정이 불가, 새 값을 생성
		
		// 1. String 객체의 내용 변경이 불가
		String str1 = new String("안녕");
		String str2 = str1;	//주소값 복사
		
		System.out.println(str1 == str2);				//true
		System.out.println(str1);						//안녕
		System.out.println(str2);						//안녕
		
		str1 = "안녕 하세요";	//새로운 공간 생성후 주소값 할당
		System.out.println(str1 == str2);				//false
		System.out.println(str1);						//안녕 하세요
		System.out.println(str2);						//안녕
		
		// 2. 다른 참조자료형은 수정 가능
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;	//주소값 복사
		arr1[0] = 6;	//값 수정
		arr1[1] = 7;
		arr1[2] = 8;
		
		System.out.println(arr1 == arr2);				//true
		System.out.println(Arrays.toString(arr1));		//[6, 7, 8]
		System.out.println(Arrays.toString(arr2));		//[6, 7, 8]
		
		
		
	}

}
