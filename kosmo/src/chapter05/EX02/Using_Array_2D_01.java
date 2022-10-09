package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_01 {

	public static void main(String[] args) {

		// 2차원 배열을 출력
		int[][] arr1 = new int[][] {{1,2,3,4,5},{6,7},{8,9,10},{11,12}};
		
		/// 1. 인덱스 번호로 직접 출력
		System.out.print(arr1[0][0]+" "+arr1[0][1]+" "+arr1[0][2]+" "+arr1[0][3]+" "+arr1[0][4]+"\n");
		System.out.print(arr1[1][0]+" "+arr1[1][1]+"\n");
		System.out.print(arr1[2][0]+" "+arr1[2][1]+" "+arr1[2][2]+"\n");
		System.out.print(arr1[3][0]+" "+arr1[3][1]+"\n");
		
		/// 2. for문 사용 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		/// 3. for each 사용 출력
		for (int[] is : arr1) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		/// 4. Arrays.toString() 사용 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}

	}

}
