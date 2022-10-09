package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_성적관리01 {

	public static void main(String[] args) {
		/* 입력할 학생수를 입력하세요. 4
		 * 4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
		 * 1째 학생의 성적을 입력 -> 88/77/66
		 * 2째 학생의 성적을 입력 -> 50/40/70
		 * 3째 학생의 성적을 입력 -> 44/33/22
		 * 4째 학생의 성적을 입력 -> 55/50/70
		 * 
		 * [결과]
		 * 
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
		
		System.out.println("입력할 학생수를 입력하세요.");
		int numOfStudent = input.nextInt();	// 학생수 입력
		input.nextLine();	// enter값 처리
		
		int[][] score = new int[numOfStudent][3];	// 점수판 배열 // 학생수만큼 열크기 지정
		
		// 배열에 입력	// 토크나이저 사용
		for (int i = 0; i < numOfStudent; i++) {	// 행의 갯수만큼 반복
			System.out.println(i+1+"번 학생의 국어, 영어, 수학 점수를 입력하세요. EX) 10/20/30 =>");
			StringTokenizer st = new StringTokenizer(input.nextLine(), "/");	// 토크나이저로 데이터 입력
			
			for (int j = 0; st.hasMoreTokens(); j++) {	// 열 // 학생점수 // 토큰 끝까지 반복
				String str = st.nextToken();	// 다음 문자열 입력
				score[i][j] = Integer.parseInt(str);	// 문자열 정수형 변환후 배열에 입력
			}
		}
		input.close();
		
		// 배열 출력 // 학생총점 // 학생평균
		for (int i = 0; i < score.length; i++) {	// 행의 갯수만큼 반복
			int studentSum = 0;	// 변수 학생총점
			for (int j = 0; j < score[i].length; j++) {	// 열의 갯수만큼 반복하며 합계 계산
				studentSum += score[i][j];
			}
			System.out.println(i+1+"번 학생의 총점은 "+studentSum+" 이고 평균은 "+(studentSum/(double)score[i].length)+" 입니다.");
		}
		
		// 과목 총점 계산
		int kor = 0, eng = 0, math = 0;
		for(int i = 0; i < numOfStudent; i++){
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
		}
		
		// 과목 총점 및 평균 출력
		System.out.println("국어과목 총점 "+kor+" 이고 평균은 "+(kor/(double)numOfStudent)+" 입니다");
		System.out.println("영어과목 총점 "+eng+" 이고 평균은 "+(eng/(double)numOfStudent)+" 입니다");
		System.out.println("수학과목 총점 "+math+" 이고 평균은 "+(math/(double)numOfStudent)+" 입니다");
		
	}

}
