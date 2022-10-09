package chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		//3항 연산자
		//	(조건) ? 참:거짓 ;
		//		조건이 참이면 '참'을 실행, 조건이 거짓이면 '거짓'을 실행
		
		int value1 = (3>5) ? 6:9;	//조건이 false 이므로 변수에 9 할당
		System.out.println(value1);
		
		int value2 = (5>3) ? 10:20;
		System.out.println(value2);	//조건이 true 이므로 변수에 10 할당
		
		int value3 = 3;
		System.out.println((value3 %2 == 0) ? "짝수":"홀수");
		
		//5의 배수를 삼항 연산자를 통해서 확인
		int value4 = 3;
		if(value4 %5 == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("5의 배수가 아니다");
		}
		System.out.println((value4 %5 == 0) ? "5의 배수":"5의 배수가 아니다");
		
		//나이가 20 이상이면 당신은 성인이다. / 성인이 아니다.
		int age = 33;
		if(age <= 20) {
			System.out.println("당신은 성인입니다.");
		}else {
			System.out.println("당신은 성인이 아닙니다.");
		}
		System.out.println((age <= 20) ? "당신은 성인입니다.":"당신은 성인이 아닙니다.");
		
		//3항 연산자는 if ~ else 문으로 변환 가능
		/* if(조건) {
		 * 		실행문1;	조건이 참이면 실행문1 실행
		 * }else {
		 * 		실행문2;	조건이 거짓일때 실행문2 실행
		 * } 
		 */
		value3 = 8;
		if(value3 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}

}
