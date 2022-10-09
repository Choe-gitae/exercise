package chapter10.EX02;

class Aa{
	int a = 10;
}
class Bb extends Aa{
	int b = 20;
}
class Cc extends Bb{
	int c = 30;
}
class Dd extends Bb{
	int d = 40;
}

public class Using_Polymorphism_01_ex {

	public static void main(String[] args) {

		// 다형적 표현
		Aa a1 = new Aa();			// 타입 Aa , 객체 Aa
		System.out.println(a1.a);
		
		Bb b1 = new Bb();			// 타입 Bb , 객체 Bb
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		// 자식 객체를 생성시 부모 타입으로 지정하면 부모의 필드와 메소드만 사용가능
		// = 좌우의 타입이 같아야 한다.
		// 업캐스팅 : 자식 타입을 부모 타입으로 변환 (컴파일러가 자동으로 넣어준다)
		Aa a2 = new Bb();			// 타입 Aa , 객체 Bb
		System.out.println(a2.a);
//		System.out.println(a2.b);
		
		// 다운캐스팅 : 부모 타입을 자식 타입으로 변환 (수동으로 명시)
		Bb b2 = (Bb)a2;
		System.out.println(b2.a);
		System.out.println(b2.b);
		
		// 업캐스팅
		Aa a3 = b2;
		
		// 다운캐스팅
		Bb b3 = (Bb)a3;
		
	}

}
