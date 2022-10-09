package chapter07.EX03;

class BB{
	// 1. 필드
	int kor;
	int eng;
	int mat;
	String name;
	
	// 2. 생성자
	BB(){}
	BB(int a, int b, int c, String name){
		kor = a;
		eng = b;
		mat = c;
		this.name = name;
	}
	
	// 3. 메소드
	// getter , setter 를 사용한 필드의 값 초기화	!!중요
	/// setter : 필드의 초기값 할당
	/// getter : 필드의 값 출력
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println(kor+", "+eng+", "+mat+", "+name);
	}
	
}

public class Using_Constructor_03 {

	public static void main(String[] args) {

		// 필드의 값을 할당하는 3가지 방법
		/// 1. 필드의 값을 직접 할당
		BB bb1 = new BB();
		bb1.name = "홍길동";
		bb1.kor = 100;
		bb1.eng = 95;
		bb1.mat = 80;
		bb1.show();
		
		/// 2. 생성자를 사용한 값 할당
		BB bb2 = new BB(10,20,30,"온달이");
		bb2.show();
		
		/// 3. setter를 사용한 값 할당
		BB bb3 = new BB();
		bb3.setName("평강이");
		bb3.setEng(100);
		bb3.setKor(100);
		bb3.setMat(100);
		bb3.show();
		
	}

}
