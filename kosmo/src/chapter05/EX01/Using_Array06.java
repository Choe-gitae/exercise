package chapter05.EX01;

public class Using_Array06 {

	public static void main(String[] args) {
		// 배열 선언 방법 1. 자료형 뒤 대괄호 <권장>
		int[] array1 = new int[3];	//배열 선언, 초기화
		
		int[] array2 ;				//배열 선언
		array2 = new int[3];		//초기화
		
		//배열 선언 방법 2. 변수명 뒤 대괄호
		int array3[] = new int[3];
		
		int array4[] ;
		array4 = new int[3];
		
		//다양한 자료형 배열 선언
		boolean[] array5 = new boolean[3];
		System.out.println(array5[0]);
		
		int[] array6 = new int[3];
		System.out.println(array6[0]);
		
		double[] array7 = new double[3];
		System.out.println(array7[0]);

		String[] array8 = new String[3];
		System.out.println(array8[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
