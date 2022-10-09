package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[3];
		
		// 3명의 국어점수를 입력하세요(ex. 10/20/30)
		System.out.println(kor.length+"명의 국어점수를 입력하세요(ex. 10/20/30)");
		String inputData = input.nextLine();
		input.close();
		StringTokenizer st = new StringTokenizer(inputData, "/");	// 문자열 토크나이저 생성 // 구분기호 "/"
		
		// 배열에 입력
		for (int i = 0; st.hasMoreTokens(); i++) {	// 뒤에 토큰이 있으면 true 없으면 false
			String str = st.nextToken();	// 다음 토큰 반환
			kor[i] = Integer.parseInt(str);	// 배열에 정수형 변환후 입력
		}
		
		// 배열 출력
		for (int i = 0; i < kor.length; i++) {
			System.out.println(i+1+"번 학생의 국어점수 : "+kor[i]);
		}
		
	}

}
