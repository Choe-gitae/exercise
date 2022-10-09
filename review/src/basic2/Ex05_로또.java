package basic2;

public class Ex05_로또 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		// 값지정	// 숙제 : 중복된 값 처리
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45)+1; // 랜덤함수 사용
		}
		
		// 버블 정렬
		for (int i = lotto.length-1; i > 0; i--) { // i값 1까지 감소하며 반복
			for (int j = 0; j < i; j++) {	// 배열의 인덱스 0 ~ i-1 까지 반복
				if(lotto[j] > lotto[j+1]) {	// 값 교환
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		// 번호 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"/");
		}
		
	}

}
