package chapter05.EX04;

import java.util.Arrays;

public class Using_String_06 {

	public static void main(String[] args) {

		/// 4. String 의 다양한 메소드
		//// 4.5 @toLowerCase() , toUpperCase() 문자열 변환 
		////				소문자			대문자
		String str1 = "Java Study";
		
		System.out.println(str1.toLowerCase());	// 소문자 변환 출력		// java study
		System.out.println(str1.toUpperCase());	// 대문자 변환 출력		// JAVA STUDY
		
		//// 4.6 @replace(원본,수정) 새로운 문자열로 대체 
		String str2 = str1.replace("Study", "공부");
		
		System.out.println(str1);									// Java Study
		System.out.println(str2);									// Java 공부
		
		//// 4.7 @substring(start index) , substring(start index, end index) 문자열을 잘라서 반환 
		//	!!주의 end index 이전까지 자른다 end index 미포함
		System.out.println(str1.substring(0,4));					// Java
		System.out.println(str1.substring(5,8));					// Stu
		System.out.println(str1.substring(5));						// Study
		
		//// 4.8 @split() 특정 문자를 기준으로 잘라서 배열에 저장 (구분기호 '|'기호 여러개 사용가능)
		String[] strArr1 = "abc/def-ghi jkl".split("/|-| ");
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i]+" ");						// abc def ghi jkl
		}
		System.out.println();	//줄바꿈
		
		for (String string : strArr1) {
			System.out.print(string+" ");							// abc def ghi jkl
		}
		System.out.println();
		
		System.out.println(Arrays.toString(strArr1));				// [abc, def, ghi, jkl]
		
		///// 4.8.EX 공백으로 자른후 for, for each, Arrays 출력
		String a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다.";
		strArr1 = a.split(" ");
		
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i]);							// 오늘은날씨가매우맑습니다...
		}
		System.out.println();
		
		for (String string : strArr1) {
			System.out.print(string);								// 오늘은날씨가매우맑습니다...
		}
		System.out.println();
		
		System.out.println(Arrays.toString(strArr1));				// [오늘은, 날씨가, 매우,...]
		
		//// 4.9 @trim() 문자열 좌우의 공백을 제거
		System.out.println("      abc      ".trim());				// abc
		
		//// 4.10 @equals() , equalsIgnoreCase() 두 문자열의 값을 비교 (true, false 반환)
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("java");
		
		System.out.println(str3.equals(str4));						// true
		System.out.println(str4.equals(str5));						// false
		System.out.println(str4.equalsIgnoreCase(str5));			// true
		
	}

}
