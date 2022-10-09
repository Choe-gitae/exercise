package chapter05.EX02;

public class Using_Rectangle_Array02 {

	public static void main(String[] args) {
		
		// 1. 2차원 정방형 배열선언 및 초기화 후 값을 넣고 출력
		int[][] arr1 = new int[2][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		System.out.println(arr1[0][0]+" "+arr1[0][1]+" "+arr1[0][2]+" / "+arr1[1][0]+" "+arr1[1][1]+" "+arr1[1][2]);

		// 1.2. 선언과 초기화 분리
		int[][] arr2;
		arr2 = new int[2][3];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		
		System.out.println(arr2[0][0]+" "+arr2[0][1]+" "+arr2[0][2]+" / "+arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]);
		
		// 2. 배열 선언시 값 바로 할당
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(arr3[0][0]+" "+arr3[0][1]+" "+arr3[0][2]+" / "+arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
		
		int[][] arr4;
		arr4 = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(arr4[0][0]+" "+arr4[0][1]+" "+arr4[0][2]+" / "+arr4[1][0]+" "+arr4[1][1]+" "+arr4[1][2]);
		
		// 3. 배열 선언시 값 할당
		//	!!선언과 초기화 분리 불가
		int[][] arr5 = {{1,2,3},{4,5,6}};
		System.out.println(arr5[0][0]+" "+arr5[0][1]+" "+arr5[0][2]+" / "+arr5[1][0]+" "+arr5[1][1]+" "+arr5[1][2]);
		
		int[][] arr6;
		//arr6 = {{1,2,3},{4,5,6}};		//오류 발생
		
	}

}
