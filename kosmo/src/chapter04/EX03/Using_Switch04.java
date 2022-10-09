package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {
		/* 문제
		 * 스캐너로 월(month)을 input 받아서 해당 월의 총 날짜(day)를
		 * "<월>월은 <일>일까지 있습니다."
		 */
		Scanner sc = new Scanner(System.in);
		int month=0;
		int day=0;
		
		System.out.println("월(Month)를 숫자로(1~12) 입력해 주세요.>>>");
		month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("%d월은 %d일까지 있습니다.",month,day);
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("%d월은 %d일까지 있습니다.",month,day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d월은 %d일까지 있습니다.",month,day);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
		
	}

}
