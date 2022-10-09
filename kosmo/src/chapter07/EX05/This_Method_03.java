package chapter07.EX05;

class Book{
	String bookName;	// 제목
	String author;		// 저자
	
	Book(){
		author = "작자 미상";
		bookName = "제목 미상";
	}
	Book(String bookName){
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author){
		this(bookName);
		this.author = author;
	}
	
	void print() {
		System.out.printf("제목 : %s , 저자 : %s\n",bookName,author);
	}
	
}
public class This_Method_03 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.print();
		
		Book book2 = new Book("수궁가");
		book2.print();
		
		Book book3 = new Book("파친코","이민진");
		book3.print();
		
	}

}
