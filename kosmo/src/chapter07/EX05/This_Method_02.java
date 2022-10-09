package chapter07.EX05;

// 여러개의 생성자를 오버로딩할 때 this() 없이 사용한 경우
/// 중복된 값을 매번 입력해야 한다.
class Aaa{
	int a,b,c,d;
	
	Aaa(){
		a = 1; 
		b = 2; 
		c = 3; 
		d = 4;
	}
	Aaa(int a){
		this.a = a; 
		b = 2; 
		c = 3; 
		d = 4;
	}
	Aaa(int a, int b){
		this.a = a; 
		this.b = b; 
		c = 3; 
		d = 4;
	}
	Aaa(int a, int b, int c){
		this.a = a; 
		this.b = b; 
		this.c = c; 
		d = 4;
	}
	Aaa(int a, int b, int c, int d){
		this.a = a; 
		this.b = b; 
		this.c = c; 
		this.d = d;
	}
	
	void print() {
		System.out.printf("%d %d %d %d\n",a,b,c,d);
	}
}
// 여러개의 생성자를 오버로딩할 때 this() 사용한 경우
class Bbb{
	int a,b,c,d;
	
	Bbb(){
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
	Bbb(int a){
		this();
		this.a = a;
	}
	Bbb(int a, int b){
		this(a);
		this.b = b;
	}
	Bbb(int a, int b, int c){
		this(a, b);
		this.c = c;
	}
	Bbb(int a, int b, int c, int d){
		this(a, b, c);
		this.d = d;
	}
	
	void print() {
		System.out.printf("%d %d %d %d\n",a,b,c,d);
	}
}
public class This_Method_02 {

	public static void main(String[] args) {

		Aaa aaa1 = new Aaa();
		aaa1.print();
		
		Aaa aaa2 = new Aaa(10);
		aaa2.print();
		
		Aaa aaa3 = new Aaa(10,20,30);
		aaa3.print();
		
		Bbb bbb1 = new Bbb();
		bbb1.print();
		
		Bbb bbb2 = new Bbb(100,200,300,400);
		bbb2.print();
		
	}

}
