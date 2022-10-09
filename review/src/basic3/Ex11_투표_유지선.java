package basic3;

import java.util.Arrays;

public class Ex11_투표_유지선 {

	public static void main(String[] args) {
		int[] a ={1,5,4,3,2,5,2,5,5,4};
		System.out.println(Arrays.toString(solution(a)));
		int[] b = {1,3,2,3,2};
		System.out.println(Arrays.toString(solution(b)));

		int[] c = {4,4,1,3,2,3,2};
		System.out.println(Arrays.toString(solution(c)));
	}//main

	static int[] solution(int [] votes) {
		Arrays.sort(votes);
		int max = 0;
		int tmax = 0;
		int count = 0;

		//몇번이 최고 반복인지 구하기
		for(int i =0; i < votes.length-1; i++) {
			tmax = (votes[i] == votes[i+1])? tmax+1: 0;
			if(max < tmax) { max = tmax; }
		}//for
		// System.out.println(max);
		
		// 최고 반복 후보들 명수 구하기
		tmax = 0;	//초기화가 필요해 보인다 //아닐지도?
		for(int i =0; i < votes.length-1; i++) {
			tmax = (votes[i] == votes[i+1])? tmax+1: 0;
			if(max == tmax) count++;
		}//for
		// System.out.println(count);
		//돌려보낼 votes 만들기
		int[] arr_ret = new int[count];
		count = 0;
		tmax = 0;	//초기화가 필요해 보인다 //아닐지도?
		for(int i =0; i < votes.length-1; i++) {
			tmax = (votes[i] == votes[i+1])? tmax+1: 0;
			if(max == tmax) arr_ret[count++] = votes[i];
		}//for
		return arr_ret;
	}//solution

}
