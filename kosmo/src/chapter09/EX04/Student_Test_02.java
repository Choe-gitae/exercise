package chapter09.EX04;

class Student02{
	static int serialNum = 1000;
	int studentID;					// 학생 ID
	String studentName;				// 학생 이름
	int grade;						// 학생 학년 : 기본값 4
	String address;					// 학생 주소 : 기본값 "서울"
}

class Student03{
	// 필드의 접근 제어자는 보안을 위해서 private 로 선언 할 수 있다.
	/// private 선언 하면 getter / setter 로만 사용
	private static int serialNum = 1000;
	private int studentID;					// 학생 ID
	private String studentName;				// 학생 이름
	private int grade;						// 학생 학년 : 기본값 4 (1~4)
	private String address;					// 학생 주소 : 기본값 "서울"
	private int month;						// 1~12
	
	// 필드의 접근 제어자를 private 로 설정하면 외부 클래스에서 사용불가
	/// 생성자나 메소드(setter)를 사용해서 필드의 내용을 사용
	/// 원하는 값을 (제어해서) 입력할 수 있다.
	Student03() {
		serialNum++;
		studentID = serialNum;
		grade = 4;
		address = "서울";
	}
	Student03(String studentName){
		this();
		this.studentName = studentName;
	}
	
	void print() {
		System.out.println("==============================");
		System.out.println("ID : "+studentID);
		System.out.println("이름 : "+studentName);
		System.out.println("학년 : "+grade);
		System.out.println("주소 : "+address);
		System.out.println("월 : "+month);
	}
	public void setGrade(int grade) {
		if(grade >= 1 && grade <= 4) {
			this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1~4 까지만 입력하세요.");
			return;
		}
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1~12 까지만 입력하세요.");
			return;
		}
	}
	
	
}

public class Student_Test_02 {

	public static void main(String[] args) {

		Student02 s = new Student02();
		
		// default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.serialNum = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
	
		Student03 s3 = new Student03("홍길동");
//		s3.serialNum = 3000;	// private
//		s3.studentID = 300;
//		s3.studentName = "홍길동";
		s3.setGrade(1);
		s3.setMonth(9);
		s3.print();
		
		
		
	}

}
