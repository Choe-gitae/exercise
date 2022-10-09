package chapter02.EX09;

public class TypeCasting_3 {
	
	public static void main(String[] args) {
		
		//1. 같은 자료형 간의 연산
		int value1=3+5;
		int value2=8/5;				//소숫점 이하 소실
		double value2_1=8/5;		//부정확한 값 출력 (1.0)
		double value2_2=8.0/5;
		
		float value3=3.0F+5.0F;
		double value4=8.0/5.0;
		
		//byte, short를 연산하면 정수(int)로 처리해야된다
		byte data1=3;
		byte data2=5;
		
		short data3=7;
		short data4=9;
		
		//byte value5=data1+data2;	//오류발생
		int value5=data1+data2;
		//short value6=data3+data4;	//오류발생
		int value5_2=data3+data4;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value2_1);
		System.out.println(value2_2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value5_2);

		System.out.println("===================================");
		
		//2. 다른 자료형 간의 연산 (작은 자료형이 큰 자료형으로 자동으로 업캐스팅되어 연산됨)
		//int value6=5+3.5;	//오류발생
		int value6=(int)(5+3.5);	//소숫점 이하 소실
		
		double value7=5+3.5;
		int value7_1=5+(int)3.5;	//소숫점 이하 소실
		
		double value8=5/2.0;
		byte data33=3;
		short data44=4;
		int value9=data33+data44;	//byte, short는 int로 연산처리		//소숫점 이하 소실
		double value10=data33+data44;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value7_1);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
	}

}
