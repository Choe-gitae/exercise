package chapter04.EX04;

public class Using_For06 {

	public static void main(String[] args) {
		//for문에서 무한루프 (조건을 생략한 경우)
		/*
		 * for(int i=0; ; i++) { 
		 * 		System.out.println(i); //무한루프 
		 * }
		 * System.out.println("문자열 출력"); //도달할 수 없는 코드
		 */
		for (int i=0; ; i++) {
			System.out.println(i);
			if(i==100) {
				break;
			}
		}
		System.out.println("문자열 출력");
		
		
		
	}

}
