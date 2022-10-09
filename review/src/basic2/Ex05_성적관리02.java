package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_성적관리02 {

	public static void main(String[] args) {
		/* 입력할 학생수를 입력하세요. 4
		 * 4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
		 * 1째 학생의 성적을 입력 -> 88/77/66
		 * 2째 학생의 성적을 입력 -> 50/40/70
		 * 3째 학생의 성적을 입력 -> 44/33/22
		 * 4째 학생의 성적을 입력 -> 55/50/70
		 * 
		 * [결과]
		 * 1째 학생의 총점 xxx 이고 평균은 ooo 입니다
		 * 2째 학생의 총점 xxx 이고 평균은 ooo 입니다
		 * 3째 학생의 총점 xxx 이고 평균은 ooo 입니다
		 * 4째 학생의 총점 xxx 이고 평균은 ooo 입니다
		 * ------------------------------------------------------------
		 * 국어과목 총점 xxx 이고 평균은 ooo 입니다
		 * 영어과목 총점 xxx 이고 평균은 ooo 입니다
		 * 수학과목 총점 xxx 이고 평균은 ooo 입니다
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 학생수를 입력하세요 -> ");
		int numOfStudent = input.nextInt();	//학생수 입력
		input.nextLine();	//엔터키 제거
		
		String[] student = new String[numOfStudent];	//문자열배열 //학생수만큼 크기지정
		
		//점수 입력
		for (int i = 0; i < student.length; i++) {	//학생수만큼 반복
			System.out.print(i+1+"번째 학생의 성적을 입력 -> ");	
			student[i] = input.nextLine();	//성적 입력
		}//for
		System.out.println();	//갱
		input.close();	//스캐너종료
		
		int korSum = 0, engSum = 0, mathSum = 0;	//변수 과목 국영수 총점
		
		//점수 출력 //학생 총점&평균
		for (int i = 0; i < student.length; i++) {	//학생수만큼 반복
			StringTokenizer st = new StringTokenizer(student[i],"/");
			
			int sum = 0;	//변수 학생 총점
			int index = 0;	//변수 인덱스
			while (st.hasMoreTokens()) {	//student[i]
				int score = Integer.parseInt(st.nextToken());	// 형변환 //student[i]
				sum += score;	//학생 총점 연산
				if(index == 0) korSum += score;	//국어 총점 연산
				if(index == 1) engSum += score;	//영어 총점 연산
				if(index == 2) mathSum += score;//수학 총점 연산
				index++;	//인덱스 증가
			}//while
			System.out.println(i+1+"번째 학생의 총점은 "+sum+" 이고 평균은 "+sum/(double)index+" 입니다.");
		}//for
		
		//점수 출력 //과목 총점&평균
		System.out.println("---------------------------------------------");
		System.out.println("국어과목 총점은 "+korSum+" 이고 평균은 "+korSum/(double)numOfStudent+" 입니다.");
		System.out.println("영어과목 총점은 "+engSum+" 이고 평균은 "+engSum/(double)numOfStudent+" 입니다.");
		System.out.println("수학과목 총점은 "+mathSum+" 이고 평균은 "+mathSum/(double)numOfStudent+" 입니다.");
		
	}//main

}
