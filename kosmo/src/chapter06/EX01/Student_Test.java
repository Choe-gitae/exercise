package chapter06.EX01;

public class Student_Test {

	public static void main(String[] args) {

		// 객체 생성은 반드시 main 메서드에서 생성 해야한다.
		
		// 같은 패키지 내부의 클래스는 임포트 없이 호출 가능
		
		Student Lee = new Student(80, 99, 70, "Lee");	// 생성자 호출
		Lee.call();		// call() 메서드 호출
		
		Student Hong = new Student(55, 44, 88, "Hong");
		Hong.call();
		
		Student Song = new Student(73, 36, 85, "Song");
		Song.call();
		
		Student Jung = new Student();	// 기본생성자 호출
		Jung.call();
		
	}

}
