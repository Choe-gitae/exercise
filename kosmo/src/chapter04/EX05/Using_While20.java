package chapter04.EX05;

import java.util.Scanner;

public class Using_While20 {

	public static void main(String[] args) {
		//업 앤 다운 게임

		Scanner sc = new Scanner(System.in);
		
		double a = (int)(Math.random()*100);
		
		System.out.println("수를 결정했습니다. 맞춰보세요 0 ~ 99");
		while(true) {
			int p = sc.nextInt();
			if(p == a) {
				System.out.println("즈엉답");
				break;
			}else if(p < a) {
				System.out.println("업");
			}else {
				System.out.println("다운");
			}
		}
		sc.close();
		
	}

}
