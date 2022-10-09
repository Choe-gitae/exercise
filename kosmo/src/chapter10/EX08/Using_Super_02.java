package chapter10.EX08;

// Super Method : 부모클래스의 생성자를 호출 super() , super(30)
/// 생성자의 내부에서만 사용
/// 생성자의 첫 라인에 위치해야 한다.

// 자식 클래스는 생성자 앞에 this(), super() 둘중 하나는 반드시 와야한다.
// 생략되어 있다면 컴파일러가 자동으로 super()를 추가한다.
class Aa {
	Aa(){
		super();	// 생략시 컴파일러가 자동으로 등록
		System.out.println("Aa 기본생성자 - Aa()");
	}
}
class Bb extends Aa{
	Bb(){
		System.out.println("Bb 기본생성자 - Bb()");
	}
}
class Cc {
	// 생성자가 존재할 경우 컴파일러는 기본생성자를 자동으로 추가하지 않는다.
	Cc(){}
	Cc(int a){
		System.out.println("Cc 생성자 - Cc(int a)");
	}
}
class Dd extends Cc{
	Dd(){
		super(3);
		System.out.println("Dd 기본생성자 - Dd()");
	}
	Dd(int a){
		this();
		System.out.println("Dd 생성자 - Dd(int a)");
	}
}

public class Using_Super_02 {

	public static void main(String[] args) {

		// 객체 생성
		Bb bb = new Bb();
		System.out.println();
		Dd dd = new Dd();
		System.out.println();
		Dd ddd = new Dd(5);
		
	}

}
