package polymo;

public class Book extends Item{
	private String author;
	private String publisher;
	
	public Book(){
		this("000","제목없음","무명","출판사");
		System.out.println("Book 기본생성자");
	}
	public Book(String num, String title, String author, String publisher) {
//		super.num = num;
//		super.title = title;
		super(num, title);
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");
	}//생성자
	
	@Override
	public void output() {
		System.out.println(num+". "+title);
		System.out.println("저자:"+author+" / 출판사:"+publisher);
	}
}
