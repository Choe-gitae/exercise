package chapter07.EX04;

class Person{
	// 클래스 : 객체를 생성하기 위한 템플릿(틀)
	// 객체(Object) : 클래스를 인스턴스화
	
	// 1. 필드 : 클래스 블락에서 선언된 변수(heap)		지역변수 : 메소드 블락에서 선언된 변수(stack)
	String name;	// 이름
	float height;	// 키
	float weight;	// 몸무게
	int age;		// 나이
	
	// 2. 생성자(Constructor)
	/// 리턴 타입이 없다.
	/// 클래스 이름과 동일
	/// 필드의 기본값을 초기화
	/// 생성자 오버로딩 : 생성자명은 동일하고 식별자(인풋매개변수 타입, 갯수)는 다르게
	Person(){}	// 기본 생성자 , 생략가능
	Person(String s){
		name = s;
	}
	Person(String name, float height){
		this.name = name;
		this.height = height;
	}
	Person(String name, float height, float weight, int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	// 3. 메소드(함수) : 기능을 실행하는 코드
	// 필드 내용을 출력
	void print() {
		System.out.printf("%s , %4.1f , %4.1f , %d\n",name,height,weight,age);
	}
	
	// 4. getter, setter : 필드의 내용을 입력 및 출력
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Using_Object_Review {

	public static void main(String[] args) {

		// 객체 생성
		/// 1. 기본생성자 호출
		Person person = new Person();
		/// 1.1 객체명으로 필드내용 출력
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.weight);
		System.out.println(person.age);
		/// 1.2 getter로 필드내용 출력
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		/// 1.3 print()
		person.print();

		/// 2. 매개변수가 1개인 생성자 호출
		Person lee = new Person("이순신");
		/// 2.1 객체명으로 필드내용 출력
		System.out.println(lee.name);
		System.out.println(lee.height);
		System.out.println(lee.weight);
		System.out.println(lee.age);
		/// 2.2 print()
		lee.print();
		
		/// 3. 매개변수가 4개인 생성자 호출
		Person hong = new Person("홍길동",189.5F,105.8F,35);
		/// 2.1 객체명으로 필드내용 출력
		System.out.println(hong.name);
		System.out.println(hong.height);
		System.out.println(hong.weight);
		System.out.println(hong.age);
		/// 2.2 print()
		hong.print();
		
		/// 4. setter를 사용해서 필드의 값할당, getter를 사용해서 필드값 출력
		Person jung = new Person();
		/// 4.1 setter를 사용해서 필드에 값할당
		jung.setName("정도령");
		jung.setWeight(70.9F);
		jung.setHeight(175.7F);
		jung.setAge(23);
		/// 4.2 getter를 사용해서 필드값 출력
		System.out.println(jung.getName());
		System.out.println(jung.getHeight());
		System.out.println(jung.getWeight());
		System.out.println(jung.getAge());
		
	}

}
