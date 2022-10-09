package chapter02.EX11;

public class Char_Type {
	
	public static void main(String[] args) {
		//char 데이터 타입 : 하나의 문자만 저장
		//	- 문자, 숫자, 유니코드로 저장 할 수 있다.
		//	- ' ' 를 사용해서 저장
		//유니코드(2byte) : 전 세계의 모든 문자를 16진수로 표기
		
		//1. 문자로 저장하는 방법
		char value1='A';
		char value2='가';
		char value3='3';	//숫자 3이 아니다
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("=====================");
		
		//2. 정수로 저장하는 방법
		char value4=65;		// A -> 65
		char value5=0xac00;	// 0x : 16진수, 가 -> 0xac00
		char value6=51;		// 3 -> 51
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("=====================");
		
		//3. 유니코드 형식으로 저장 (\\u유니코드) : ' '를 사용
		char value7='\u0041';	// A
		char value8='\uac00';	// 가
		char value9='\u0033';	// 3
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("=====================");
		
		char value100=35;	// # -> 35
		System.out.println(value100);
		
		char value101='\uac12';	// 값 -> ac12
		System.out.println(value101);
		System.out.println("=====================");
		
		//구글 검색을 사용해서 유니코드를 이용하여 char 변수에 저장하여 표기
		char name1='\uCD5C';
		char name2='\uAE30';
		char name3='\uD0DC';
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println();
		System.out.println("=====================");
		
		//문자 A를 저장하는 다양한 방법
		char a='A';
		char b=65;
		char c=0b1000001;
		char d=00101;
		char e=0x0041;
		char f='\u0041';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
