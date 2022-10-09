package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If02 {

	public static void main(String[] args) {
		//점수와 학년을 input 받아서 60점이상이면 합격, 미만이면 불합격
		//	4학년인 경우 70점 이상이면 합격 , 중첩 if문 사용
		//	점수 score , 학년 year
		
		Scanner sc = new Scanner(System.in);
		int score, year;
		
		System.out.println("학년을 입력하세요. (1~4)");
		year = sc.nextInt();
		System.out.println("점수를 입력하세여. (0~100)");
		score = sc.nextInt();
		
		if(year==4) {
			if(score>=70) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			if(score>=60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
		
		sc.close();
	}

}
