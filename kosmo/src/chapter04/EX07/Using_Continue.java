package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		//continue : 아래의 코드를 실행하지 않고 반복
		//	- if문과 같이 사용
		
		// 1. 단일 loop에서 continue
		for(int i=0; i<10; i++) {
			System.out.println("i:"+i+" A");
			continue;
			//System.out.println("i:"+i+" B");	//도달할 수 없는 코드 오류
		}
		
		System.out.println("=======================");
		for(int i=0; i<10; i++) {
			System.out.println("i:"+i+" A");
			if(i%2 == 0) {	//짝수
				continue;
			}
			System.out.println("i:"+i+" B");
		}
		
		System.out.println("=======================");
		for(int i=0; i<10; i++) {
			if(i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("\n=======================");
		// 문제1. for문을 사용해서 1 ~ 1000까지 1씩 증가하고 continue를 사용해서 3의 배수만 출력하세요.
		for(int i=1; i<=1000; i++) {
			if(i%3 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("\n=======================");
		// 문제2. for문을 사용해서 1 ~ 1000까지 1씩 증가하고 continue를 사용해서 5의 배수만 출력하세요.
		for(int i=1; i<=1000; i++) {
			if(i%5 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("\n=======================");
		// 문제3. for문을 사용해서 1 ~ 1000까지 1씩 증가하고 if를 사용해서 3, 5, 7의 배수만 출력하세요.
		for(int i=1; i<=1000; i++) {
			if(i%3 == 0 || i%5 == 0 || i%7 == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n=======================");
		// 2. 다중 loop에서 continue
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("\n===========label============");
		out: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue out;
				}
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("\n===========변수값 false============");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					i = 100;
					continue;
				}
				System.out.println(i+","+j);
			}
		}
		
		
	}

}
