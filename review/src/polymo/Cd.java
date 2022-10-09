package polymo;

public class Cd extends Item{
	String singer;
	
	public Cd(){
		this("000","제목없음","이름없음");
		System.out.println("Cd 기본생성자");
	}
	public Cd(String num, String title, String singer) {
//		super.num = num;
//		super.title = title;
		super(num, title);
		this.singer = singer;
		System.out.println("Cd 인자생성자");
	}//생성자
	
	@Override
	public void output() {
		System.out.println(num+". "+title);
		System.out.println("가수:"+singer);
	}
}
