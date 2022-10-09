package chapter04.EX06;

public class Using_Do_While01 {

	public static void main(String[] args) {
		// while : 조건을 비교후 실행문을 실행
		// do while : 1번은 실행후 조건을 비교후 실행
		
		// 1. while
		int a = 11;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println("\n=====조건과 상관없이 실행문 1번 실행=====");
		a = 11;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);
		
		
		// while문과 do while문 10번 실행
		System.out.println("\n=====while=====");
		a = 0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println("\n=====do while=====");
		a = 0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);

	}

}
