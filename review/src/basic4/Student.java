package basic4;

//학번 이름 String 
// 국어 영어 수학 총점 Integer
// 평균 Double
// 1. 배열 : 동일한 자료형
// 2. 구조체 : 서로 다른 자료형
//		자바에 없다.
// 3. 클래스 : 서로 다른 자료형들 + 함수

/*
 *  캡슐화
 *  	- 멤버변수(field) : private
 *  	- 멤버메소드 : public
 */

public class Student {
	
	private String hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public Student() {
//		this.name = "이름없음";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;
		this("이름없음",50,50,50);	//첫째줄
		System.out.println("기본생성자");
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
		System.out.println("인자 있는 생성자");
	}//Student()

	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}//get set
	
	public void calTotal() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name+"님 성적 : "+total+"/"+avg);
	}
	
}
