package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If05 {

	public static void main(String[] args) {
		/* 스캐너로 나이를 input 받아서 출력 :
		 * 나이(age)가 8세 미만이면 : "취학 전 아동입니다."
		 * 						 "입장료는 <1000>원 입니다.
		 * 나이 14세 미만이면 : "초등학생입니다."
		 * 					"입장료는 <2000>원 입니다.
		 * 나이 20세 미만이면 : "중, 고등학생입니다."
		 * 					"입장료는 <2500>원 입니다.
		 * 나이 20세 이상이면 : "일반인입니다."
		 * 					"입장료는 <3000>원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int price = 0;
		
		if(age<8) {
			price = 1000;
			System.out.printf("취학 전 아동입니다.\n입장료는 %d원 입니다.",price);
		}else if(age<14) {
			price = 2000;
			System.out.printf("초등학생입니다.\n입장료는 %d원 입니다.",price);
		}else if(age<20) {
			price = 2500;
			System.out.printf("중, 고등학생입니다.\n입장료는 %d원 입니다.",price);
		}else {
			price = 3000;
			System.out.printf("일반인입니다.\n입장료는 %d원 입니다.",price);
		}
		sc.close();

	}

}
