package chapter05.EX04;

import java.util.Arrays;

public class Using_String_05 {

	public static void main(String[] args) {

		// String 의 주요한 특징 : 특별한 기능
		/// 1. 수정이 불가능하다. 새로운 값을 만든다.
		/// 2. 리터럴로 값을 넣을 경우 동일한 문자열이라면 주소 공유
		/// 3. 객체 자체를 출력할 때 객체의 주소가 출력되지 않고 객체의 값이 출력 (toString() 메소드가 재정의 되어 있다.)
		/// 4. 다양한 메소드가 정의되어 있다.
		
		//// 4.1 문자열의 길이 [length()]
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());							// 11
		System.out.println(str2.length());	//유니코드로 1byte 처리		// 13
		
		//// 4.2 @charAt() , indexOf() , lastIndexOf() 문자열 검색 
		///// 4.2.1 charAt() : 해당 index 의 문자를 가져온다
		System.out.println(str1.charAt(0));							// H
		System.out.println(str1.charAt(4));							// o
		System.out.println(str1.charAt(6));							// J
		System.out.println(str2.charAt(4));							// 요
		System.out.println(str2.charAt(8));							// 갑
		
		///// 4.2.2 indexOf() : 해당 글자에 대한 index 출력 (앞에서 부터 찾는다)
		/////		lastIndexOf() : 해당 글자에 대한 index 출력 (뒤에서 부터 찾는다)
		System.out.println(str1.indexOf('a'));						// 7
		System.out.println(str1.lastIndexOf('a'));					// 9
		////// 'a' 문자를 8번 index 부터 검색해서 index 출력
		System.out.println(str1.indexOf('a',8));					// 9
		System.out.println(str1.lastIndexOf('a',8));				// 7
		////// "Java" 문자열을 검색해서 index 출력
		System.out.println(str1.indexOf("Java"));					// 6
		System.out.println(str1.lastIndexOf("Java"));				// 6
		System.out.println(str2.indexOf("하세요"));					// 2
		////// 없는 내용을 검색시 -1 반환
		System.out.println(str2.indexOf("bye"));					// -1
		System.out.println(str2.indexOf("반갑습니다."));				// 7
		System.out.println(str2.indexOf("고맙습니다."));				// -1
		
		//// 4.3 @String.valueOf() , concat() 문자열 반환 및 연결 
		String str3 = String.valueOf(2.3);	// double => string
		String str4 = String.valueOf(false);// boolean => string
		System.out.println(str3);									// 2.3
		System.out.println(str4);									// false
		
		String str5 = str3.concat(str4);	// +(연결연산자)와 같다
		System.out.println(str5);									// 2.3false
		
		//// 4.4 @getBytes() , toCharArray() 문자열을 byte배열, char배열로 저장 
		String str6 = "Hello Java!";
		String str7 = "안녕하세요";
		
		byte[] arr1 = str6.getBytes();	// 영문은 아스키코드로 변환
		byte[] arr2 = str7.getBytes();	// 문자는 숫자코드로 변환
		System.out.println(Arrays.toString(arr1));					// [72, 101, 108...]
		System.out.println(Arrays.toString(arr2));					// [-20, -107, -120...]
		
		char[] arr3 = str6.toCharArray();	// 문자열을 잘라서 저장
		char[] arr4 = str7.toCharArray();	// 문자열을 잘라서 저장
		System.out.println(Arrays.toString(arr3));					// [H, e, l, l, o...]
		System.out.println(Arrays.toString(arr4));					// [안, 녕, 하, 세, 요]
		
	}

}
