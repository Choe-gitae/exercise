package basic1;

public class Ex03_For {

	public static void main(String[] args) {
		
		// 1) 1 ~ 10 까지 숫자 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+" ");
		}
		
		// 2) 'A' 부터 'Z' 까지 출력
/*		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch+=2) {
			System.out.print(ch+" ");
		}
		System.out.println();
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch+" ");
		}
*/		
		System.out.println();
		// 문제
		// 1) 1부터 10까지의 합을 출력
		// 2) 1부터 10까지의 홀수의 합을 출력
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 1; i < 11; i++) {
			if(i%2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
