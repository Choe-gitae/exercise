package chapter04.EX06;

import java.util.Scanner;

public class Using_Do_While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu = 0;		//Scanner input
		
		do {
			System.out.println("=============================");
			System.out.println("1.문자열 출력 | 2.정수 출력 | 3.종료");
			System.out.println("=============================");
			System.out.println("원하는 번호를 입력하세요.");
			nu = sc.nextInt();
			
			if(nu==1) {
				System.out.println("1.문자열을 출력합니다.\n");
			}else if(nu==2) {
				System.out.println("2.정수를 출력합니다.\n");
			}else {
				break;
			}
		}while(run);	//무한루프
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
