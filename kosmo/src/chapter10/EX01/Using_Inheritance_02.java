package chapter10.EX01;

class Fruit{
	String name;
	String color;
	int large;
	
	void eat() {
		System.out.println("모든 과일은 맛있습니다.");
	}
	void print() {
		System.out.println("============================");
		System.out.println(name+" , "+color+" , "+large);
	}
}
class Apple extends Fruit{
	int appleCount;
	void show() {
		System.out.println("사과의 갯수 : "+appleCount);
	}
}
class Orange extends Fruit{
	int orangeCount;
	void show() {
		System.out.println("오렌지의 갯수 : "+orangeCount);
	}
}
class Banana extends Fruit{
	int bananaCount;
	void show() {
		System.out.println("바나나의 갯수 : "+bananaCount);
	}
}

public class Using_Inheritance_02 {

	public static void main(String[] args) {

		// Fruit 객체 생성
		Fruit f = new Fruit();
		f.name = "과일";
		f.color = "과일색";
		f.large = 10;
		f.print();
		f.eat();
		
		// Apple 객체 생성
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨강";
		a.large = 5;
		a.appleCount = 50;
		a.print();
		a.show();
		
		// Orange 객체 생성
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황";
		o.large = 7;
		o.orangeCount = 30;
		o.print();
		o.show();

		// Banana 객체 생성
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노랑";
		b.large = 9;
		b.bananaCount = 20;
		b.print();
		b.show();
	
	}

}
