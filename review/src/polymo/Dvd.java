package polymo;

public class Dvd extends Item{
	String actor;
	String director;
	
	public Dvd(){
		this("000", "제목없음", "배우없음", "감독없음");
		System.out.println("Dvd 기본생성자");
	}
	public Dvd(String num, String title, String actor, String director) {
//		super.num = num;
//		super.title = title;
		super(num, title);
		this.actor = actor;
		this.director = director;
		System.out.println("Dvd 인자생성자");
	}
	
	@Override
	public void output() {
		System.out.println(num+". "+title);
		System.out.println("배우:"+actor+" / 감독:"+director);
	}
}
