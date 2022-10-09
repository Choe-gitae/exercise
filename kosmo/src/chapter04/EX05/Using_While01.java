package chapter04.EX05;

public class Using_While01 {

	public static void main(String[] args) {
		// while (조건) {
		//		실행문 ;
		// }
		// - while 반복 횟수를 알 수 없는 경우 사용.
		// - for 반복 횟수를 알 수 있는 경우 사용
		
		// - 초기값 선언을 반드시 while문 밖에서 선언을 해야 한다. (while문 안에서 선언시 무한루프)
		// - 증가값은 while문 내에서 선언을 함. (증가값을 선언하지 않으면 무한루프)

		// 1. while문에서 반복 횟수가 0인 경우
		int a = 0;	//변수의 초기값은 while문 밖에서 선언
		while(a<0) {	//false
			System.out.print(a+" ");		//조건이 true일때만 실행
		}
		
		// 2. while문에서 반복 횟수가 1번인 경우
		System.out.println("=====반복 횟수 1 break=====");
		a = 0;
		while(a==0) {
			System.out.println(a+" ");
			break;
		}
		
		System.out.println("=====반복 횟수 1 증감식=====");
		a = 0;
		while(a==0) {
			System.out.println(a+" ");
			a++;
		}
		
		System.out.println("=====반복 횟수 10=====");
		a = 0;							//초기값 while문 밖에서 선언
		while(a<10) {
			System.out.print(a+" ");
			a++;						//증가값은 while내에서 처리
		}
		System.out.println();
		
		System.out.println("=====초기값을 while문 내에 넣는경우 : 무한루프");
		a = 0;
		while(a<10) {
			//a = 0;					//초기값으로 인해 무한루프
			System.out.print(a+" ");
			a++;						//증가값은 while내에서 처리
		}
		
		// while문은 조건을 생략 할 수 없다.
		// for문은 조건을 생략시 무한루프
		// while문에서 무한루프를 돌릴 때 조건에 true
		System.out.println();
		System.out.println("==============================");
		
		a = 0;
		boolean b = true;
		while(b) {
			System.out.printf(a+" ");
			a++;
			if(a>200) {
				break;
			}
		}
		
		
		
		
	}

}
