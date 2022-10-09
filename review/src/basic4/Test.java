package basic4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		CalculatorExpr c1 = new CalculatorExpr();

		Scanner sc = new Scanner(System.in);
		String yn; // do 중괄호 내에 선언하면 while의 조건문에 yn이라는 변수 사용 불가
		int count = 0;

		do {
			System.out.println("계산할 숫자 2개를 입력해 주세요 >>>");

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			sc.nextLine();
			c1.setNum1(num1);
			c1.setNum2(num2);
			// c1.setNum1(sc.nextInt()); // 이렇게 변수 선언 없이 바로 넣어도 괜찮다
			// c1.setNum2(sc.nextInt());
			if (count > 0) System.out.println("추출된 숫자 : " + c1.getNum1() + ", " + c1.getNum2());
			System.out.println("덧셈 : " + c1.getAddition());
			System.out.println("뺄셈 : " + c1.getSubtraction());
			System.out.println("곱셈 : " + c1.getMultiplication());
			System.out.println("나눗셈 : " + c1.getDivision());

			System.out.println("계속 진행하시겠습니까? Yes면 Y, No면 N을 입력해 주세요 >>>");
			yn = sc.nextLine();
			count++;
		} while (yn.equalsIgnoreCase("Y")); // 여기도 sc.nextLine().eualsIgnoreCase("Y") 이렇게 써도 된다
	}
}

