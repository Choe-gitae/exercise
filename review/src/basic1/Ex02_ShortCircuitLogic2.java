package basic1;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {

		int a = 3;
		
		if(a > 3 & ++a > 3) {					// 숏서킷 미적용
			System.out.println("조건만족");		// 출력X
		}
		System.out.println("a = "+a);			// a = 4
		
		if(a > 1 | ++a > 3) {					// 숏서킷 미적용
			System.out.println("조건만족2");		// 출력O
		}
		System.out.println("a = "+a);			// a = 5
		
	}

}
