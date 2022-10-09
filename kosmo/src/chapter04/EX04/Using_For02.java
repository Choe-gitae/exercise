package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {

	public static void main(String[] args) {
		//for문을 사용해서 스캐너로 5개의 값을 input 받아 출력
		Scanner sc = new Scanner(System.in);
		
		String s;
		for(int i=0; i<5; i++) {
			s = sc.next();
			System.out.println(s);
		}
		
		//for문 내에서 변수 선언시 for문 내에서만 사용
		//	- 클래스에서 재사용이 가능
		int a = 0;	//전역변수
		for(int i=0; i<3; i++) {	// i : 지역변수 for문 내에서만 사용가능
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a);		
		sc.close();
		
	}

}
