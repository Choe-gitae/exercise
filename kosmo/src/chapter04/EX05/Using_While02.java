package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		// Scanner를 사용해서 -1이 될 때까지 정수값을 넣어서 평균값 구하기
		Scanner sc = new Scanner(System.in);
		int count = 0;	//정수가 입력되는 갯수를 카운트
		int sum = 0;	//입력 받는 정수를 모두 더한 값
		
		System.out.println("원하는 정수를 입력 하세요. -1을 입력하면 종료");
		int n = sc.nextInt();
		
		while(n != -1) {	//입력 받은 정수 값이 -1이 아니면 while문 실행
			sum += n;		//sum = sum+n;
			count++;		//카운트 증가
			n = sc.nextInt();	//정수 -1을 받을 때까지 무한루프
		}
		if(count==0) {
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.printf("입력된 정수 : %d개 입니다.\n",count);
			System.out.printf("입력된 정수의 합 : %d 입니다.\n",sum);
			System.out.printf("평균 : %f\n",sum/(double)count);
		}
		sc.close();

	}

}
