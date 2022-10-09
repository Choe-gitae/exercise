package basic1;

public class Ex03_For응용 {

	public static void main(String[] args) {

		// 문제 1
		System.out.println("문제 1");
		for (int i = 0; i < 26; i++) {	// 26번 반복 // i = 0~25
			for (char ch = 'A'; ch <= 'A'+i; ch++) {	// A부터 출력 // 반복 횟수를 i만큼 증가 시키며 반복출력
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// 문제 2
		System.out.println("문제 2");
		for (int i = 0; i < 26; i++) {	// 26번 반복 // i = 0~25
			for (char ch = 'A'; ch <= 'Z'-i; ch++) {	// A ~ Z 까지 출력 // i만큼 반복 횟수 감소
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// 문제 3
		System.out.println("문제 3");
		for (int i = 0; i < 26; i++) {	// 26번 반복 // i = 0~25
			for (int ch = 'A'+i; ch <= 'Z'; ch++) {	// 초기값을 i만큼 증가 // 'Z'까지 출력
				System.out.print((char)ch);	// int형 char형 캐스팅
			}
			System.out.println();
		}
		
		// 문제 4
		System.out.println("문제 4");
		for (int i = 0; i < 26; i++) {	// 26번 반복 // i = 0~25
			for (char ch = 'Z'; ch >= 'Z'-i; ch--) {	// Z부터 감소출력 // 증감식 -- // 반복횟수 i만큼 증가
				System.out.print(ch);
			}
			System.out.println();
		}
		
		// 문제 5
		System.out.println("문제 5");
		for (int i = 0; i < 26; i++) {	// 26번 반복 // i = 0~25
			for(int j = 0; j < i; j++) {	// i값 만큼 공백넣기
				System.out.print(" ");
			}
			for (int ch = 'A'+i; ch <= 'Z'; ch++) {	// 초기값을 i만큼 증가 // 'Z'까지 출력
				System.out.print((char)ch);	// int형 char형 캐스팅
			}
			System.out.println();
		}
		
	}

}
