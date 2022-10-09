package basic5;

public class Book {

	private static int count;
	
	public Book() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}
