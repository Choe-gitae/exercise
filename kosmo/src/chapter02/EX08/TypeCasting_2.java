package chapter02.EX08;

public class TypeCasting_2 {

	public static void main(String[] args) {
		//1. 자동 타입 변환 (업캐스팅)
		float value1=3;		//int -> float 업캐스팅
		long value2=5;		//int -> long 업캐스팅
		double value3=7;	//int -> double 업캐스팅
		byte value4=9;		//예외 int -> byte 다운캐스팅
		short value5=11;	//예외 int -> short 다운캐스팅
		
		//2. 수동 타입 변환 (다운캐스팅)
		byte value6=(byte)128;
		int value7=(int)3.5;
		float value8=(float)7.5;
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}

}
