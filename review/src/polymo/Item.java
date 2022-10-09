package polymo;

abstract public class Item {
	protected String num;
	protected String title;
	
	public Item(){}
	public Item(String num, String title) {
		this.num = num;
		this.title = title;
	}//생성자
	
	abstract public void output();
	//메소드
}
