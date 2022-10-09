package chapter09.EX04;

class B{
	int m = 3;
	static int n = 5;
}

public class Test_B {

	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = new B();
		
		b1.m = 5;
		b2.m = 6;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		b1.n = 7;
		b2.n = 8;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		
		B.n = 100;
		System.out.println(b1.n);
		System.out.println(b2.n);
		
	}
}
