package basic3;

import java.util.Arrays;

public class Ex11_투표 {
	
	static int[] solution(int n, int[] votes) {
		//후보자 배열 생성
		int[] candidate = new int[n];
		//후보자 등록
		for (int i = 0; i < candidate.length; i++) {
			candidate[i] = i+1;
		}//for
		//후보자 수만큼 표집계 배열 생성
		int[] count = new int[candidate.length];
		//개표
		for (int i = 0; i < candidate.length; i++) {
			for (int j = 0; j < votes.length; j++) {
				if(candidate[i] == votes[j]) {
					count[i]++;
				}//if
			}//for
		}//for
		//개표결과 내림차순 버블정렬
		for (int i = count.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(count[j] < count[j+1]) {	//비교후 작은수 뒤로 정렬
					//투표수 교환
					int temp = count[j];
					count[j] = count[j+1];
					count[j+1] = temp;
					//후보자 교환
					temp = candidate[j];
					candidate[j] = candidate[j+1];
					candidate[j+1] = temp;
				}//if
			}//for
		}//for
		//투표수 같을 경우 계산
		int elected = 1;	//변수 당선자 카운트
		for (int i = 0; i < count.length-1; i++) {
			if(count[i] == count[i+1]) {
				elected++;
			}else {
				break;
			}//if else
		}//for
		//당선자 수만큼 결과 배열 크기 지정
		int[] result = new int[elected];
		//정렬된 후보자 결과 배열에 입력
		for (int i = 0; i < elected; i++) {
			result[i] = candidate[i];
		}//for
		return result;
	}//solution
	
	public static void main(String[] args) {

		int[] votes = {1,5,4,3,2,5,2,5,5,4};
		int[] result = solution(5, votes);
		System.out.println(Arrays.toString(result));
		
	}//main
	
}
