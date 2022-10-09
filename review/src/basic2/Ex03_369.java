package basic2;

/* 
 * [문제]
 * 369
 * 1부터 50까지 숫자 중에서 3,6,9 숫자가 포함되면
 * 그 갯수만큼 '짝'글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력
 */

public class Ex03_369 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {	// 50번 반복
			int su = i;	// 변수 현재 숫자
			boolean su369 = false;	// 변수 
			
			while(su != 0) {
				int na = su%10;	// 나머지 값으로 369 검출
				if(na == 3 | na == 6 | na == 9) {
					System.out.print("짝");
					su369 = true;	// 369에 걸리면 true
				}
				su = su / 10;	// 윗 자릿값 대입
			}
			
			if(su369) System.out.println();	// "짝" 출력했으면 갱
			else System.out.println(i);	// "짝" 출력 안했으면 현재 숫자 출력
		}
		
	}

}
