package chapter08.EX01;

// 접근 제어자 : 캡슐화
/// 객체를 보호하기 위해서 접근제한
/// 클래스 : public  default
/// 필드 , 메소드 : public  protected  default  private

//// 1. public : 같은 패키지의 모든 클래스에서 접근 가능
////			 다른 패키지의 모든 클래스에서 접근 가능
//// 2. protected : 같은 패키지의 모든 클래스에서 접근 가능
////				다른 패키지와 상속관계에 있을 때 접근 가능
//// 3. default : 같은 패키지의 모든 클래스에서 접근 가능
////			  다른 패키지에서 접근 불가능
//// 4. private : 같은 파일에서만 접근 가능
////			  같은 패키지와 다른 패키지 접근 불가능

public class A {
	public int m = 3;
	public int n = 4;
	
	public void print() {
		System.out.println("A 클래스 접근");
	}
}
