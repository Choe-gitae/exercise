package chapter07.EX01;

public class Using_Method_04 {

	// 같은 클래스에서 메서드 호출
	//	main 메서드는 static 키워드가 붙은 메서드
	//	static 메서드 내에서는 인스턴스 필드, 메서드 직접 호출 불가 (객체화후 호출)
	//	같은 static 키워드가 붙어야 직접 호출 가능
	
	// "안녕" 출력
	static void print() {
		System.out.println("안녕");
	}
	
	// 인풋값 2배로 반환
	static int twice (int a) {
		return a*2;
	}
	
	// 받은 두 값을 더해서 반환
	static double sum(int a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {

		// 같은 클래스 내부에서 메소드 호출
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 3.14);
		System.out.println(b);
		
	}

}
