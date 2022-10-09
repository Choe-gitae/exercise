package chapter05.EX02;

public class Using_Rectangle_Array01 {

	public static void main(String[] args) {
		
		///// 1. 2차원 정방형 배열 선언 및 초기화
		int[][] arr1 = new int[3][4];	// [3]행 : [4]열
		
		///// 1.2 2차원 정방형 배열 선언과 초기화 분리
		int[][] arr2;
		arr2 = new int[3][4];
		
		///// 2. 배열변수명 뒤 [][]		//권장하지 않는다.
		int arr3[][] = new int[3][4];
		
		int arr4[][];
		arr4 = new int[3][4];
		
		///// 3. 자료형과 변수에 각각 []	//권장하지 않는다.
		int[] arr5[] = new int[3][4];
		int[] arr6[];
		arr6 = new int[3][4];
		
		///// 4. 다양한 자료형의 배열 선언
		int[][] arr7 = new int[3][4];
		boolean[][] arr8 = new boolean[2][4];
		double[][] arr9 = new double[4][5];
		String[][] arr10 = new String[2][6];
		

	}

}
