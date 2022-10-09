package chapter06.EX01;

public class Student {

	// 필드
	int kor;	// 국어 점수
	int eng;	// 영어 점수
	int mat;	// 수학 점수
	String name;	// 학생 이름
	
	// 생성자
	Student(){};
	Student(int kor, int eng, int mat, String name){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.name = name;
	}
	
	// 메서드 : 합과 평균 계산 후 출력
	void call() {
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.println(name+"의 총 점수 : "+sum+" , 평균 : "+avg);
	}
	
}
