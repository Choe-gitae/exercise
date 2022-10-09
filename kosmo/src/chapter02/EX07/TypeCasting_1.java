package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		//1. 캐스팅 방법
			//1) 데이터 타입을 명시
		int value1=(int)5.3;			//소숫점 이하 소실
		long value2=10;					//업캐스팅
		float value3=(float)5.8;
		double value4=16;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
			//2) L / F
		long value5=10L;
		long value6=10l;
		float value7=5.8F;
		float value8=5.8f;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}

}
