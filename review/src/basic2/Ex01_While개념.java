package basic2;

public class Ex01_While개념 {

	public static void main(String[] args) {
		
		// 2. for 1~10까지 합
		int sum = 0;	// 변수 합계
		for (int i = 1; i < 11; i++) {	// 1~10 반복
			sum += i;
		}
		System.out.println(sum);

		// 1. while 1~10까지 합
		sum = 0;	// 변수 sum 초기화
		int i = 1;	// i 초기값
		while (i < 11) {	// 1~10 반복
			sum += i;	// 합계
			i++;	// 증감식
		}
		System.out.println(sum);
		
		// 2. do~while 1~10까지 합
		sum = 0;	// 변수 sum 초기화
		i = 1;	// i 초기값
		do {	
			sum += i;	// 합계
			i++;	// 증감식
		}while (i < 11);	// 1~10 반복
		System.out.println(sum);
		
	}

}
