package chapter04.EX06;

import java.util.Scanner;

public class Using_Do_Wihle03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;
		
		do {
			System.out.println("===================================================");
			System.out.println(" 1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("===================================================");
			System.out.println("원하는 숫자를 선택하세요 >>>");
			
			nu = sc.nextInt();
			if(nu==1) {
				System.out.println("1. 19단 출력");
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++) {
						System.out.printf("%dx%d=%d\t",i,j,i*j);
					}
					System.out.println();
				}
			}else if(nu == 2) {
				System.out.println("2. 홀수단 출력");
				for(int i=1; i<=19; i++) {
					if(i%2 != 0) {
						for(int j=1; j<=19; j++) {
							System.out.printf("%dx%d=%d\t",i,j,i*j);
						}
					}
					if(i%2 != 0) {
						System.out.println();
					}
				}
			}else if(nu == 3) {
				System.out.println("3. 3의 배수단 출력");
				for(int i=1; i<=19; i++) {
					if(i%3 == 0) {
						for(int j=1; j<=19; j++) {
							System.out.printf("%dx%d=%d\t",i,j,i*j);
						}
					}
					if(i%3 == 0) {
						System.out.println();
					}
				}
			}else {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}while(run);
		
	}

}
