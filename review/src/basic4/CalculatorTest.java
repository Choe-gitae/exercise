package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CalculatorExpr calc = new CalculatorExpr();
		
		boolean check = false;
		int count = 0;
		String inputStr = null;
		do {
			
			//입력
			System.out.println("숫자 2개를 입력하세요.");
			calc.setNum1(input.nextInt());
			calc.setNum2(input.nextInt());
			//출력
			if(count != 0) {
				System.out.println("추출된 숫자 : "+calc.getNum1()+", "+calc.getNum2());
			}
			System.out.println("덧셈 : "+calc.getAddition());
			System.out.println("뺄셈 : "+calc.getSubtraction());
			System.out.println("곱셈 : "+calc.getMultiplication());
			System.out.println("나눗셈 : "+calc.getDivision());
			//질문
			System.out.println("계속 진행 하시겠습니까? (Y,N)-> ");
			inputStr = input.next();
			//입력값 감지 및 진행여부 검출
			while(true) {
				if(inputStr.equalsIgnoreCase("Y")) {
					check = true;
					break;
				}else if(inputStr.equalsIgnoreCase("N")) {
					check = false;
					break;
				}else {
					System.out.println("잘못된 값을 입력하셨습니다.");
					System.out.println("계속 진행 하시겠습니까? (Y,N)-> ");
					inputStr = input.next();
				}//if else
			}//while
			count++;
			if(count == 100) count = 1;
		}while(check);
		//do while
		
		input.close();
		
	}

}
