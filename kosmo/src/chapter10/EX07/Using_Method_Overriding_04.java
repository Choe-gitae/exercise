package chapter10.EX07;

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Gozilla extends Animal{
	int count;
	Gozilla(int a){
		this.count = a;
	}
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
	int count;
	Caesar(int a){
		this.count = a;
	}
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
	int count;
	Sandfox(int a) {
		this.count = a;
	}
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
	int count;
	Gorani(int a){
		this.count = a;
	}
	@Override
	void run() {
		System.out.println("아아아아아앍아아아아아앍");
	}
	@Override
	void eat() {
		System.out.println("아아아아앍켁켘");
	}
}


public class Using_Method_Overriding_04 {

	public static void main(String[] args) {

		// 배열에 저장
		Animal[] animals = new Animal[] {
				new Gozilla(2), new Caesar(1), new Sandfox(5), new Gorani(300)};
		
		int count = 0;	// 동물 총 합계
		// 다운캐스팅 && 동물 수 합계
		// for 출력
		System.out.println("=====for=====");
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
			animals[i].eat();
			if(animals[i] instanceof Gozilla) {
				Gozilla temp = (Gozilla)animals[i];
				count += temp.count;
			}
			if(animals[i] instanceof Caesar) {
				Caesar temp = (Caesar)animals[i];
				count += temp.count;
			}
			if(animals[i] instanceof Sandfox) {
				Sandfox temp = (Sandfox)animals[i];
				count += temp.count;
			}
			if(animals[i] instanceof Gorani) {
				Gorani temp = (Gorani)animals[i];
				count += temp.count;
			}
		}
		System.out.println("동물의 총 마리수 : "+count);
		
		// for each 출력
		System.out.println("=====for each=====");
		for (Animal animal : animals) {
			animal.run();
			animal.eat();
		}
		System.out.println("동물의 총 마리수 : "+count);
		
	}

}
