package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력
		
		String[] s = new String[] {"연개소문","강감찬","세종대왕","이순신","궁예"};
		
		System.out.println("=====직접 출력=====");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		System.out.println("=====for문 사용=====");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("=====향상된 for문 사용=====");
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("=====Arrays.toString 사용=====");
		System.out.println(Arrays.toString(s));
		
		
	}

}
