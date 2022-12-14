package chapter04.EX03;

public class Using_Switch01 {

	public static void main(String[] args) {
		//switch 문 - 반드시 break;를 사용해서 해당 case를 탈출
		
		//1.switch 문에서 break;를 사용하지 않는 경우
		//해당 case로 점프후에 하위의 모든 case를 실행
		int a = 2;
		
		switch(a) {	//위치변수 : 정수 , 문자 , 문자열
		case 1:
			System.out.println("변수값을 출력"+a);
		case 2:
			System.out.println("변수값을 출력"+a);
		case 3:
			System.out.println("변수값을 출력"+a);
		case 4:
			System.out.println("변수값을 출력"+a);
		default :	//if 문의 else와 같이 case의 값이 없는 경우
			System.out.println("변수값을 출력"+a);
		}
		
		System.out.println("========================");
		
		//2.switch 문에서 break; 사용
		a = 1;
		
		switch(a) {	//위치변수 : 정수 , 문자 , 문자열
		case 1:
			System.out.println("case 1을 출력"+a);
			break;
		case 2:
			System.out.println("case 2을 출력"+a);
			break;
		case 3:
			System.out.println("case 3을 출력"+a);
			break;
		case 4:
			System.out.println("case 4을 출력"+a);
			break;
		default :	//if 문의 else와 같이 case의 값이 없는 경우
			System.out.println("default를 출력"+a);
		}
		
		System.out.println("==================");
		
		//7점이상인 경우 pass, 그렇지 않은 경우 fail
		int b = 6;
		
		switch(b) {
		case 10:
			System.out.println("Pass");
			break;
		case 9:
			System.out.println("Pass");
			break;
		case 8:
			System.out.println("Pass");
			break;
		case 7:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
		}
		
		System.out.println("===================");
		
		//축약 표현
		b = 8;
		switch(b) {
		case 10: case 9: case 8: case 7:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
		}
		
		System.out.println("====================");
		
		//switch 문 <==> if ~ else if 문과 상호 변환 가능
		int c = 8;
		
		switch (c) {
		case 10: case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default:
			System.out.println("D 학점");
		}
		
		c = 7;
		if(c>9) {
			System.out.println("A 학점");
		}else if(c==8) {
			System.out.println("B 학점");
		}else if(c==7) {
			System.out.println("C 학점");
		}else {
			System.out.println("D 학점");
		}

	}

}
