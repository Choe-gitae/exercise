package basic2;

import java.util.Scanner;

// for		: 반복횟수가 정해진 경우
// while	: 반복횟수를 모르는 경우
// do~while	: 반복횟수를 모르는 경우 (조건을 나중에 비교)

public class Ex02_반복문구분 {

	public static void main(String[] args) {

		// 구구단 단수를 입력받아서 해당 단의 구구단을 출력
		Scanner input = new Scanner(System.in);	// 스캐너 변수 input
		
		// for
/*		System.out.println("몇 번 반복을 할까요?");
		int su = input.nextInt();	// 변수 반복횟수 지정
		
		System.out.println("단을 입력해 주세요");
		int dan = input.nextInt();	// 변수 단 입력
		
		for (int i = 0; i < su; i++) {	// 입력받은 값만큼 반복
			for (int j = 1; j < 10; j++) {	// 1~9 반복
				System.out.println(dan+"x"+j+" = "+(dan*j));
			}
		}
*/
		
		// while
/*		while(true) {
			System.out.println("단을 입력해 주세요");
			int dan = input.nextInt();	// 변수 단 입력
			
			for (int j = 1; j < 10; j++) {	// 1~9 반복
				System.out.println(dan+"x"+j+" = "+(dan*j));
			}
			
			System.out.println("종료해? (Y)");
			input.nextLine();
			String answer = input.nextLine();	// 변수 종료키 입력받는 변수
			if(answer.equalsIgnoreCase("Y")) break;	// 'Y' 입력 받으면 종료
		}
*/
		
		// do~while
		do {
			System.out.println("단을 입력해 주세요");
			int dan = input.nextInt();	// 변수 단 입력
			
			for (int j = 1; j < 10; j++) {	// 1~9 반복
				System.out.println(dan+"x"+j+" = "+(dan*j));
			}
			
			System.out.println("종료해? [Y]");
			input.nextLine();
			String answer = input.nextLine();	// 변수 종료키 입력받는 변수
			if(answer.equalsIgnoreCase("Y")) break;	// 'Y' 입력 받으면 종료
		}while(true);
		
		input.close();
	}

}
