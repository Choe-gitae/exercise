package inheri;

public class Ddal extends Mother{

	public Ddal() {
		System.out.println("딸 생성");
	}//생성자
	
	public void study() {
		System.out.println("딸은 공부중");
	}
	@Override
	public void job() {
		System.out.println("직업없음");
	}//메소드
}
