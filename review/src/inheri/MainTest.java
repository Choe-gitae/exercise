package inheri;

public class MainTest {

	public static void main(String[] args) {

//		Mother m = new Mother();
//		m.job();
//		m.gene();
		
//		Ddal d = new Ddal();
//		d.study();
//		d.job();
//		d.gene();
		
//		Ddal d = new Mother();
		
		// 부모변수에 자식객체 생성이 가능
//		Mother m = new Ddal();
//		m.gene();
//		m.job();
//		
//		Mother m = new Mother();
//		Ddal d = (Ddal)m;
		
		Ddal d = new Ddal();
		Mother m = (Mother)d;
		Ddal d2 = (Ddal)m;
		
	}

}
