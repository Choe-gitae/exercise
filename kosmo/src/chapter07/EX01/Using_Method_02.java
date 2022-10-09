package chapter07.EX01;

class Circle{
	
	// 필드
	double radius;	// 반지름
	String name;	// 이름
	
	// 생성자	: 크기와 이름 입력 받은 후 필드값 수정
	Circle(int a, String name) {
		this.radius = a / 2.0;
		this.name = name;
	}
	
	// 메서드 : 넓이 계산 및 출력
	void call() {
		System.out.println(this.name+" 반지름 : "+radius);
		System.out.println(this.name+" 넓이 : "+radius*radius*3.14);
	}
}

public class Using_Method_02 {

	public static void main(String[] args) {

		// 원의 지름을 넣었을 때 전체 넓이를 구하는 객체를 생성 후 출력
		//		출력
		//		<피자> <반지름> : <00>
		//		<피자> 넓이 : <00>
		//		<도넛> <반지름> : <00>
		//		<도넛> 넓이 : <00>
		
		Circle pizza = new Circle(10, "피자");
		pizza.call();
		
		Circle donut = new Circle(5, "도넛");
		donut.call();
		
	}

}
