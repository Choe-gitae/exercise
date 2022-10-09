package chapter10.EX06;

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Gozilla extends Animal{
	@Override
	void run() {
		System.out.println("쿵쾅쿵쾅 쿠아아아아아");
	}
	@Override
	void eat() {
		System.out.println("우거우걱 허겁지겁 쩝쩝");
	}
}
class Caesar extends Animal{
	@Override
	void run() {
		System.out.println("우우하하하이히히히히우우우");
	}
	@Override
	void eat() {
		System.out.println("우우우우우아아아아아아아");
	}
}
class Sandfox extends Animal{
	@Override
	void run() {
		System.out.println("우다다다다다다다다다다다다");
	}
	@Override
	void eat() {
		System.out.println("ㅡㅠㅡ");
	}
}
class Gorani extends Animal{
	@Override
	void run() {
		System.out.println("아아아아아앍아아아아아앍");
	}
	@Override
	void eat() {
		System.out.println("아아아아앍켁켘");
	}
}


public class Using_Method_Overriding_03 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[] {
				new Gozilla(), new Caesar(), new Sandfox(), new Gorani()};
		
		// for 출력
		System.out.println("=====for=====");
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
			animals[i].eat();
		}
		
		// for each 출력
		System.out.println("=====for each=====");
		for (Animal animal : animals) {
			animal.run();
			animal.eat();
		}
		
	}

}
