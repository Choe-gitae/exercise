package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// for문 내에 if문
		// 정수(음수,양수)를 스캐너로 input 받아서
		// 양수만 더한 값과 평균 값을 출력하세요.
		// input 받은 모든 값을 더한 값과 평균 값을 출력하세요.
		// 무한루프 탈출 정수 : 0
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int toSum = 0;
		int count = 0;
		int toCount = 0;
		
		for(;;) {
			System.out.println("정수를 입력하세요 (음수,양수)>>>");
			int num = sc.nextInt();
			if(num==0) {
				sc.close();
				break;
			}
			toSum += num;
			toCount++;
			if(num>0) {
				sum += num;
				count++;
			}
		}
		System.out.println("양수만 더한 값 : "+sum);
		System.out.println("평균값 : "+sum/(double)count);
		System.out.println("모든 수를 더한 값 : "+toSum);
		System.out.println("모든 값의 평균 값 : "+toSum/(double)toCount);
		
	}

}
