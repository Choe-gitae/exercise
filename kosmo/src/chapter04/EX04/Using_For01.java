package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		 *for (초기값 ; 조건 ; 증가값) {
		 *		실행문1 ;	 -조건이 참일동안 계속 반복, 거짓이면 for문을 빠져나옴
		 * }
		 */
		
		//기본 for문
		int a;
		for(a=0;a<100;a++) {
			System.out.print(a);
		}
		System.out.println("\n===================");
		
		//초기값과 증가값에는 ,로 구분해서 여러개의 변수가 올수있다.
		int b,c,d;
		for(b=0,c=10,d=20; b<5; b++,c+=2,d+=5) {
			System.out.printf("b:%d c:%d d:%d \n",b,c,d);
		}
		System.out.println("\n===================");
		
		//for문에서 무한루프 (조건이나 증가값을 잘못 처리할 경우)
		int e;
		for(e=0;e<10;e+=3) {
			System.out.println(e);
		}
		System.out.println("===================");
		
		//1부터 10까지 for문을 사용하지 않고 덧셈
		int sum1 = 0;
		sum1 += 1;
		sum1 += 2;
		sum1 += 3;
		sum1 += 4;
		sum1 += 5;
		sum1 += 6;
		sum1 += 7;
		sum1 += 8;
		sum1 += 9;
		sum1 += 10;
		System.out.println("1~10까지의 합 : "+sum1);
		
		//for문을 사용해서 1부터 10까지 덧셈
		int sum2 = 0;
		int i;
		for(i=1; i<=10; i++) {
			sum2 += i;
			System.out.printf("i : %d , sum2 : %d \n",i,sum2);
		}
		System.out.println("1~10까지의 합 : "+sum2);
		
		System.out.println("===================");
		
		//for문을 사용해서 0 ~ 1000 까지 7의 배수의 합계 출력
		int sum3 = 0;
		for(i=0; i<=1000; i+=7) {
			sum3 += i;
		}
		System.out.println(i);
		System.out.println("7의 배수의 합계 : "+sum3);
		System.out.println("===================");
		
		//for문과 if문을 사용해서 1 ~ 10 까지 더한 값을 출력 하되 아래와 같이 출력하세요.
		//	결과 : 1+2+3+4+5+6+7+8+9+10=55
		int sum4 = 0;
		for(i=1; i<=10; i++) {
			sum4 += i;
			if(i<10) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+sum4);
			}
		}
	}


}
