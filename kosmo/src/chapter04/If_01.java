package chapter04;

public class If_01 {

	public static void main(String[] args) {
		/*
		 * 제어문 : 프로그램의 순서를 바꾸는 구문
		 * 	- 선택 제어문 : if , switch
		 * 	- 반복 제어문 : for , while , do while
		 * 
		 * if : 조건을 만족하는 실행문을 실행후 if문을 빠져나온다 (break를 사용하지 않더라도 if문을 빠져나온다)
			- if (조건) {실행문 ;} 	//조건이 참일때 실행
			
			- if (조건) {
				실행문1 ;			//조건이 참일때
			  }else {
				실행문2 ;			//조건이 거짓일때
			  }
			  
			- if (조건1) {		//조건1 참일때
				실행문1 ;
			  }else if (조건2) {	//조건2 참일때
			  	실행문2 ;
			  }else if (조건3) { //조건3 참일때
			  	실행문3 ;
			  }else {			//위의 모든 조건을 만족하지 않을때
			  	실행문4 ;
			  }			  
		 */
		
		// if (조건) {실행문 ;}
		System.out.println("===false===");
		if(3>5) {	//조건 false 실행문 실행안함
			System.out.println("안녕");
			System.out.println("방가");
		}
		System.out.println("===true===");
		if(3<5) {
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		// if 조건에서 실행문이 1개 일때는 중괄호를 생략 할 수 있다.
		System.out.println("==================");
		if(5>3)
			System.out.println("오늘은 비가 옵니다.");
		
		System.out.println("==================");
		
		/* if (조건) { 
		 * 		실행문1 ;
		 * }else {
		 * 		실행문2 ;
		 * }
		 */
		if(5>3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("==================");
		
		//변수 선언 : 동일한 변수를 여러개 선언할 때 ,로 구분
		//	- 기본 자료형 (8가지) : 초기값을 할당하지 않으면 오류
		//		boolean , byte , short , int , long , float , double , char
		//	- 참조 자료형 (무한대) : 초기값을 할당하지 않으면 컴파일러가 자동으로 할당
		int a, b;
		//System.out.println(a);	//변수값을 할당하지 않아서 오류
		a=5; b=0;					//변수값 할당
		if(a>5) {
			b=10;
		}else {
			b=20;
		}
		System.out.println(b);
		
		// if ~ else 구문을 삼항 연산자로 변환
		System.out.println((a>5) ? 10:20);
		System.out.println("================");
		
		// 조건이 여러개인 경우 : if ~ else if ~ else 구문
		// 조건을 만족하는 실행문을 실행후 if문 탈출
		int c;
		c=85;
		
		if(c>=90) {									//false
			System.out.println("A 학점입니다.");
		}else if(c>=80) {							//true
			System.out.println("B 학점입니다.");		//실행문 실행후 break
		}else if(c>=70) {
			System.out.println("C 학점입니다.");
		}else if(c>=60) {
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("학점 미달입니다.");
		}
		
	}

}
