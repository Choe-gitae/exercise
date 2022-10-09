package chapter07.EX03;

class AA{
	// 1. 필드
	int a;
	int b;
	int c;
	int d;
	String name;
	
	// 2. 생성자
	AA(){
		System.out.println("기본생성자 호출");
	}
	
	AA(int a){
		this.a = a;
	}
	
	AA(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	AA(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	AA(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	AA(int a, int b, int c, int d, String e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		name = e;
	}
	
	// 3. 메소드
	void show() {
		System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d+" name:"+name);
	}
	
}

public class Using_Constructor_02 {

	public static void main(String[] args) {

		// Constructor(생성자) 오버로딩
		AA aa1 = new AA();
		aa1.show();
		
		AA aa2 = new AA(2);
		aa2.show();
		
		AA aa3 = new AA(2,5);
		aa3.show();
		
		AA aa4 = new AA(2,5,10);
		aa4.show();
		
		AA aa5 = new AA(2,5,10,13);
		aa5.show();
		
		AA aa6 = new AA(2,5,10,13,"홍길동");
		aa6.show();
		
	}

}
