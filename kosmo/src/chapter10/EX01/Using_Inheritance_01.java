package chapter10.EX01;

// 클래스 외부 구성요소
/// 1.패키지 , 2.임포트 , 3.외부클래스

// 클래스 내부 구성요소
/// 1.필드 , 2.생성자 , 3.메소드 , 4.이너클래스

// 상속(Inheritance) : 객체지향 언어의 꽃
/// 부모클래스(Super Class)의 필드와 메소드, 이너클래스를 자식클래스에게 물려준다.
/// 자식클래스(Child Class)는 부모 클래스의 생성자를 제외한 내부 구성요소를 물려받는다.
/// 코드를 간결하게 사용
/// 유지 보수를 아주 쉽게 한다.
/// 다형성 사용 : 부모클래스의 메소드를 자식클래스에서 재정의(Overriding)해서 사용



// 부모클래스(Super Class) : 자식클래스의 공통적인 특징을 가지는 클래스
class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다");
	}
	void print() {
		System.out.println("==========================");
		System.out.println(name+" , "+age);
	}
}

// 자식클래스,(Child Class) : 부모클래스의 필드와 메소드, 이너클래스를 상속 받는다.
/// 자식클래스만의 특징이 적용된 필드와 메소드 사용
class Student extends Human{
	int studentID;
	
	void goToSchool() {
		System.out.println("학생이 학교에 갑니다.");
	}
}
class Worker extends Human{
	int workerID;
	
	void goToWork() {
		System.out.println("직장인이 일하러 갑니다");
	}
}
class Professor extends Human{
	int professorID;
	
	void goToCollage() {
		System.out.println("교수님은 대학교에 갑니다.");
	}
}

public class Using_Inheritance_01 {
	
	public static void main(String[] args) {
		
		// Human 클래스 객체 생성
		Human h = new Human();
		h.name = "홍길동";
		h.age = 16;
		h.print();
		h.eat();
		h.sleep();
		
		// Student 클래스 객체 생성
		Student s = new Student();
		s.name = "세자세종";				// 상속받은 필드
		s.age = 11;					// 상속받은 필드
		s.studentID = 1001;			// Student 클래스 필드
		s.print();					// 상속받은 메소드
		s.eat();					// 상속받은 메소드
		s.sleep();					// 상속받은 메소드
		s.goToSchool();				// Student 클래스 메소드
		
		// Worker 클래스 객체 생성
		Worker w = new Worker();
		w.name = "신사임당";
		w.age = 40;
		w.workerID = 1002;
		w.print();
		w.eat();
		w.sleep();
		w.goToWork();
		
		// Professor 클래스 객체 생성
		Professor p = new Professor();
		p.name = "이황";
		p.age = 55;
		p.professorID = 1002;
		p.print();
		p.eat();
		p.sleep();
		p.goToCollage();
		
	}
	
}
