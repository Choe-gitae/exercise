package basic2;

public class Ex03_CompanyA {

	public static void main(String[] args) {
/*		문제 : 8의 숫자 세기(구글입사문제)

		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.

		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)

		결과 : 4000
*/
		int count = 0;	//변수 카운트 //8의 갯수 카운트
		for (int i = 1; i <= 10000; i++) {	//1~10,000 반복
			int su = i;	//변수 현재 수
			
			while(su != 0) {
				int na = su % 10;	// 변수 나머지값 // 1의 자릿값 대입
				if(na == 8) {
					count++;
				}//if
				su = su / 10;	// 윗 자릿값 대입
			}//while
		}//for
		System.out.println(count);	//출력

		//지선씨 //천재다 //확실하다 //왼손베팅
		int sum = 0;	//8의 갯수 카운트
		
		for(int i = 1; i <= 10000; i++) {	//1~10,000 반복
			String s = String.valueOf(i);	//int to string
			
			for (int j = 0; j < s.length(); j++) {	//length() 문자열 길이 반환
				if(s.charAt(j) == '8') {	//문자열 순환하며 8값 찾기
					sum+=1;	//카운트증가
				}//if
			}//for
		}//for
		System.out.println(sum);	//출력
		
	}//main

}
