package chapter10.EX05;

class Animal{
	void cry() {
		System.out.println("모든 동물은 웁니다.");
	}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}


public class Using_Method_Overriding_02 {

	public static void main(String[] args) {

		// 1. 각각의 타입으로 선언 및 생성
		Animal a = new Animal();
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		a.cry();
		b.cry();
		c.cry();
		d.cry();
		
		System.out.println("====================");
		// 2. Animal 타입으로 각 동물객체 생성
		Animal bb = new Bird();
		Animal cc = new Cat();
		Animal dd = new Dog();
		bb.cry();
		cc.cry();
		dd.cry();
		
		System.out.println("=========배열=========");
		// 배열이나 컬렉션에 넣어 아주 쉽게 관리가 가능하다.
		// 배열의 특징 : 1. 동일한 타입을 저장 , 2. 방의 크기가 선언되면 바꿀수 없다.
		// 3. 배열
		Animal[] animals1 = new Animal[] {new Bird(), new Cat(), new Dog() };
		Animal[] animals2 = new Animal[] {bb, cc, dd};
		
		/// for문 출력
		for (int i = 0; i < animals1.length; i++) {
			animals1[i].cry();
		}
		
		/// for each 출력
		for (Animal animal : animals2) {
			animal.cry();
		}
		
	}

}
