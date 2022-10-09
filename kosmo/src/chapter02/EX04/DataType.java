package chapter02.EX04;

public class DataType {

	public static void main(String[] args) {

		/*
		 자바의 자료형
		 	- 기본 자료형 8가지 : 첫자가 소문자
		 		- boolean	: true, false
		 		- byte		: 정수 (1byte)	-2^7 ~ +2^7-1		-128 ~ +127
		 		- short		: 정수 (2byte)	-2^15 ~ +2^15-1		-32,768 ~ +32,767
		 		- int		: 정수 (4byte)	-2^31 ~ +2^31-1		
		 		- long		: 정수 (8byte)	값을 할당할 때 12345L
		 		- float		: 실수 (4byte)	값을 할당할 때 123.45F
		 		- double	: 실수 (8byte)
		 		- char		: 문자 ' '
		 		
		 	- 참조 자료형 무한대 : 첫자가 대문자
		 		- 배열, 클래스/인터페이스
				- String 	: 문자열 " "
		*/
		
		boolean aaa;
		aaa=true;	aaa=false;
		System.out.println(aaa);
		
		byte bbb;
		bbb=127;
		System.out.println(bbb);
		
		byte bb;
		byte cc;
		//bb=128;		//byte 범위를 넘겨서 입력 오류
		bb=(byte)128;	//-128							//(byte) 원형구조
		cc=(byte)129;	//-127
		System.out.println("bb 의 출력값 : "+bb);
		System.out.println("cc 의 출력값 : "+cc);
		
		short ccc;
		ccc=32767;
		System.out.println(ccc);
		
		short abc;
		abc=32767;			//short 변수의 마지막 수
		abc=(short)32768;	//-32768
		System.out.println("abc 의 출력값"+abc);
		
		int ddd;
		ddd=123456789;
		System.out.println(ddd);
		
		long eee;
		eee=1234567890123456789L;
		System.out.println(eee);
		
	}

}
