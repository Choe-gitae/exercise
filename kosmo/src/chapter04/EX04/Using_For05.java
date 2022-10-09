package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		
		// 이중 for문을 사용해서 구구단 출력
		// 출력 : 1*1=1	1*2=2	1*3=3 ... 1*9=9		1~9단
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println("======================================================================");
		
		// 1단 ~ 19단까지 3의 배수 단만 출력
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=9; j++) {
				if(i%3==0) {
					System.out.printf("%d*%d=%d\t",i,j,i*j);
				}
			}
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.println("======================================================================");
		
		// 스캐너에서 입력 받은 단만 출력 (1 ~ 9단)
		/*	1*1=1
		 * 	1*2=2
		 * 	.....
		 * 	1*9=9
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력 하세요. (1~9단)");
		int dan = sc.nextInt();
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(dan==i) {
					System.out.printf("%d*%d=%d \n",i,j,i*j);
				}
			}
		}
		
		System.out.println("출력할 단을 입력 하세요. (1~9단)");
		dan = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		sc.close();

	}

}
