package chapter05.EX01;

import java.util.Scanner;

public class Using_Array09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 라인 input
		System.out.println("문자열을 입력하세요 >>>");
		String str1 = sc.nextLine();		//라인 전체를 통채로 input받음
		System.out.println(str1);
		
		// 한 문자열 input
		System.out.println("문자열을 입력하세요 >>>");
		String str2 = sc.next();			//한 단어 input
		System.out.println(str2);
		
		sc.close();
		
		
		
		

	}

}
