package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02 {

	public static void main(String[] args) {

		String[][] arr1 = new String[][] {{"홍길동","이순신","세종대왕"},
			{"독수리","부엉이","닭","오리"},
			{"붕어","가물치","잉어"},
			{"호랑이","사자"}};
			
		// 출력 //	
		// 사람이름 : 홍길동 이순신 세종대왕
		// 새이름 : 독수리 부엉이 닭 오리
		// 물고기이름 : 붕어 가물치 잉어
		// 포유류이름 : 호랑이 사자
		
		String[] arr2 = {"사람이름","새이름","물고기이름","포유류이름"};	//종류 배열 선언 및 초기화
		
		// 1. for문 출력
		for (int i = 0; i < arr1.length; i++) {			//행 반복
			System.out.print(arr2[i]+" : ");			//종류 출력
			for (int j = 0; j < arr1[i].length; j++) {	//열 출력
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();	//줄바꿈
		}
			
		// 2. for each 출력
		int index = 0;	//arr2 인덱스
		for (String[] string : arr1) {
			System.out.print(arr2[index]+" : ");	//종류 출력
			index++;	//arr2 인덱스 증가
			for (String string2 : string) {
				System.out.print(string2+" ");
			}
			System.out.println();	//줄바꿈
		}
		
		// 3. Arrays.toString() 출력
		for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr2[i]+" : ");	//종류 출력
				System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		System.out.println("=====선생님 코드=====");
		///// 선생님 코드
		// 1. for문 출력
		for (int i = 0; i < arr1.length; i++) {
			if(i==0) System.out.print("사람이름 : ");
			if(i==1) System.out.print("새이름 : ");
			if(i==2) System.out.print("물고기이름 : ");
			if(i==3) System.out.print("포유류이름 : ");
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		// 2. for each 출력
		for (String[] a : arr1) {
			for (String b : a) {
				if(b.equals("홍길동")) System.out.print("사람이름 : ");
				if(b.equals("독수리")) System.out.print("새이름 : ");
				if(b.equals("붕어")) System.out.print("물고기이름 : ");
				if(b.equals("호랑이")) System.out.print("포유류이름 : ");
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		// 3. Arrays.toString() 출력
		for (int i = 0; i < arr1.length; i++) {
			if(i==0) System.out.print("사람이름 : ");
			if(i==1) System.out.print("새이름 : ");
			if(i==2) System.out.print("물고기이름 : ");
			if(i==3) System.out.print("포유류이름 : ");
			System.out.println(Arrays.toString(arr1[i]));
		}
		
	}

}
