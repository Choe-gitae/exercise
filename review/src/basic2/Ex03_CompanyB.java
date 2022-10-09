package basic2;
/* 문제 369게임
 * 
 * 손뼉친 횟수를 리턴하도록 solution함수를 완성해주세요
 * 
 * 제한사항) 
 * 숫자에 3,6,9가 여러개 있더라도 손뼉은 한번만 칩니다.
 * 입력값 num = 1 ~ 100,000
 * 
 * 예시) 1 ~ 15 까지 게임진행 한 경우
 * 1-2-짝!(3)-4-5-짝!(6)-7-8-짝!(9)-10-11-12-짝!(13)-14-15 출력
 * 3, 6, 9, 13에 숫자 3,6,9가 포함되어 총 4회의 손뼉을 칩니다.
 */

class Game369{
	public void solution(int num) {
		// 369게임
		int count = 0;	// 변수 손뼉 카운트
		for (int i = 1; i <= num; i++) {
			int su = i;	// 현재 숫자 대입
			boolean su369 = false;	// 변수 369확인
			while(su != 0) {	// su가 0이 되면 탈출
				int na = su % 10;	// 변수 나머지값 // 1의 자릿수
				if(na == 3 | na == 6 | na == 9) {	// 369 검사
					count++;	// 카운트 증가
					su369 = true;	// 369 true
					break;	// while 탈출
				}//if
				su = su / 10;	// 윗 자릿값 대입
			}//while
			if(i != 1) System.out.print("-");	// i가 1이 아니면 "-" 출력
			if(su369) System.out.print("짝!("+i+")");	// 369 걸리면 짝출력
			else System.out.print(i);	// 369 안걸리면 현재 숫자 출력
		}//for
		
		System.out.println();	// 갱
		for (int i = 1; i <= num; i++) {
			int su = i;	// 현재 숫자 대입
			boolean su369 = false;	// 변수 369확인
			while(su != 0) {	// su가 0이 되면 탈출
				int na = su % 10;	// 변수 나머지값 // 1의 자릿수
				if(na == 3 | na == 6 | na == 9) {	// 369 검사
					su369 = true;	// 369 true
					break;	// while 탈출
				}//if
				su = su / 10;	// 윗 자릿값 대입
			}//while
			if(su369) {
				if(i != 3) System.out.print(","); // i가 3이 아니면 "," 출력
				System.out.print(i);	// 369 걸리면 짝출력
			}//if
		}//for
		System.out.print("에 숫자 3,6,9가 포함되어 총 "+count+"회의 손뼉을 칩니다.");
	}//solution(int num)
}//class Game369

public class Ex03_CompanyB {

	public static void main(String[] args) {
		
		Game369 game369 = new Game369();
		game369.solution(13);
		
	}//main

}
