package chapter05.EX02;

public class Using_Read_Array_2D {

	public static void main(String[] args) {
		
		// 2차원 배열의 값을 읽기
		//		1차원 배열 : arr.length	열의 갯수
		//		2차원 배열 : arr.length	행의 갯수
		
		/// 0. 1차원 배열의 길이
		int[] arr0 = new int[100];
		System.out.println(arr0.length);	//열의 갯수 [100]개
		
		/// 1. 2차원 배열의 길이 (정방형)
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length);	//행의 갯수 [2]개
		System.out.println(arr1[0].length);	//[0]행의 열의 갯수 [3]개
		System.out.println(arr1[1].length);	//[1]행의 열의 갯수 [3]개
		
		/// 2. 2차원 배열의 길이 (비정방형)
		int[][] arr2 = new int[][] {{1,2,3},{4,5,6,7}};
		System.out.println(arr2.length);	//행의 갯수 [2]개
		System.out.println(arr2[0].length);	//[0]행의 열의 갯수 [3]개
		System.out.println(arr2[1].length);	//[1]행의 열의 갯수 [4]개
		
		// 2차원 배열 출력
		/// 1. 인덱스 번호로 직접 출력
		System.out.print(arr2[0][0]+" "+arr2[0][1]+" "+arr2[0][2]+"\n");
		System.out.print(arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]+" "+arr2[1][3]+"\n");
		
		/// 2. for문 사용 출력
		for (int i = 0; i < arr2.length; i++) {			//행 반복
			for (int j = 0; j < arr2[i].length; j++) {	//열 출력
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();	//행마다 줄바꿈
		}
		
		/// 3. for each문 사용 출력
		for (int[] a : arr2) {				
			for (int b : a) {				
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
	}

}
