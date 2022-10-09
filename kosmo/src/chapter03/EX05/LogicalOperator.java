package chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		//논리 연산자 && AND , || OR , ^ XOR , ! NOT
		//	연산자 좌우에 true, false
		
		// AND 연산 : &&
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true&&(5<3));
		System.out.println((5<=5)&&(7>2));
		System.out.println();
		
		// OR 연산 : ||
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||(5<3));
		System.out.println((5<=5)||(7>2));
		System.out.println();
		
		// XOR 연산 : ^
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^(5<3));
		System.out.println((5<=5)^(7>2));
		System.out.println();
		
		// NOT : !
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3));
		System.out.println((5<=5) || !(7>2));
		System.out.println();
		
		//비트연산자로 논리 연산을 수행
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|(5<3));
		System.out.println((5<=5) | (7>2));
		System.out.println();
		
		//숏 서킷 (short circuit)
		//	왼쪽의 결과 값만으로 유추 가능할 때 오른쪽의 값을 실행하지 않는 것
		//	논리 연산자에서만 작동, 비트 연산자에서는 작동이 되지않는다
		
		//논리 연산에서는 short circuit이 발생
		int value1=3;
		System.out.println(false && ++value1 > 6);	//short circuit
		System.out.println(value1);					//3, ++value1 미작동
		
		//비트 연산은 short circuit이 미발생
		int value2=3;
		System.out.println(false & ++value2 > 6);
		System.out.println(value2);
		
		int value3=3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4=3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);

	}

}
