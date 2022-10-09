package chapter09.EX04;

class Student{
	static int serialNum;
	int studentID;					// 학생 ID
	String studentName;				// 학생 이름
	int grade;						// 학생 학년 : 기본값 4
	String address;					// 학생 주소 : 기본값 "서울"
	String introduce;				// 자기소개란
	
	static {
		serialNum = 1000;
	}
	
	Student(){
		Student.serialNum++;
		studentID = Student.serialNum;
		grade = 4;
		address = "서울";
	}
	Student(String studentName){
		this();
		this.studentName = studentName;
	}
	Student(String studentName, String introduce){
		this(studentName);
		this.introduce = introduce;
	}
	
	void print() {
		System.out.println("==============================");
		System.out.println("ID : "+studentID);
		System.out.println("이름 : "+studentName);
		System.out.println("학년 : "+grade);
		System.out.println("주소 : "+address);
		if (introduce == null)
			return;
		System.out.println("자기소개란\n"+introduce);
	}
}

public class Student_Test {

	public static void main(String[] args) {

		// studentID : 1000 부터 학생객체를 생성할때 마다 고유값 적용
		// 학생객체 생성시 자동으로 학번 1000번 부터 등록
		// 객체생성 입력매개변수 이름
		// 학년과 주소는 4, "서울" 고정
		
		Student lee = new Student("이박사");
		lee.print();
		Student hong = new Student("홍길동");
		hong.print();
		Student lim = new Student("임꺽정");
		lim.print();
		Student won = new Student("전당포 아저씨","금이빨 빼고 다 씹어먹어 줄께");
		won.print();
		Student kim = new Student("미미","크레스트스럿ㅌ흐(크리스틴 스튜어트)");
		kim.print();
		
	}

}
