package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[3];
		int sum = 0;
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i+1+"번 학생의 국어점수를 입력 =>");
			kor[i] = input.nextInt();
		}
		input.close();
		
		// 출력 및 합계 계산
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i+1+"번 학생의 국어점수 : "+kor[i]);
			sum += kor[i];
		}
		
		// 위 학생들 점수의 총점과 평균을 출력
		System.out.println("학생들 총점 : "+sum+" / 평균 : "+sum/(double)kor.length);
		
		
		
		
		
		
	}

}
