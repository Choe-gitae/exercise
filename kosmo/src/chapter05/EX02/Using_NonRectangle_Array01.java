package chapter05.EX02;

public class Using_NonRectangle_Array01 {

	public static void main(String[] args) {
		
		// 비정방형 배열
		/// 1. 비정방형 배열 선언후 값 할당
		int[][] arr1 = new int[2][];	//행의 갯수만 지정, 열의 갯수는 나중에 지정
		arr1[0] = new int[2];			//[0]번 행에 [2]열 지정
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		
		arr1[1] = new int[3];			//[1]번 행에 [3]열 지정
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
		///// 출력
		System.out.println(arr1[0][0]+" "+arr1[0][1]);
		System.out.println(arr1[1][0]+" "+arr1[1][1]+" "+arr1[1][2]);
		
		/// 2. 비정방형 배열 선언시 값 할당
		int[][] arr2 = new int[2][];
		arr2[0] = new int[] {1,2};		//[0]번 행에 값 입력 - 자동으로 열의 갯수 지정
		arr2[1] = new int[] {3,4,5};	//[1]번 행에 값 입력 - 자동으로 열의 갯수 지정
		///// 출력
		System.out.println(arr2[0][0]+" "+arr2[0][1]);
		System.out.println(arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]);
		
		/// 3. 비정방형 배열 선언시 값 할당
		int[][] arr3 = new int[][] {{1,2},{3,4,5}};
		///// 출력
		System.out.println(arr3[0][0]+" "+arr3[0][1]);
		System.out.println(arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
		
		/// 3.2 선언과 값 할당 분리
		int[][] arr4;
		arr4 = new int[][] {{1,2},{3,4,5}};
		///// 출력
		System.out.println(arr4[0][0]+" "+arr4[0][1]);
		System.out.println(arr4[1][0]+" "+arr4[1][1]+" "+arr4[1][2]);
		
		/// 3.3 선언시 값 할당
		////	!! 선언과 초기화 분리 불가능
		int[][] arr5 = {{1,2},{3,4,5}};;
		///// 출력
		System.out.println(arr5[0][0]+" "+arr5[0][1]);
		System.out.println(arr5[1][0]+" "+arr5[1][1]+" "+arr5[1][2]);
		
		int[][] arr6;
		//arr6 = {{1,2},{3,4,5}};;		//오류발생
		
		
	}

}
