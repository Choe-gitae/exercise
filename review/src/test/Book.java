package test;

public class Book {

	private String title;
	private String author;
	private String publisher;
	boolean bool;

	Book(String title, String author, String publisher){
		this.author = title;
		this.title = author;
		this.publisher = publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void getTitle() {
		System.out.println("책 제목:"+title);
	}
	public void getAuthor() {
		System.out.println("저자:"+author);
	}
	public void getPublisher() {
		System.out.println("출판사:"+publisher);
	}

}
