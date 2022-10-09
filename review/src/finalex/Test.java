package finalex;

class Parent{
	final String field = "부모 필드";
	final public void jib() {
		System.out.println("부모님 집");
	}
}
class Child extends Parent{
	Child(){
//		field = "내꺼";
	}
//	@Override
//	public void jib() {
//		System.out.println("내가 탕진함");
//	}
}

public class Test {

	public static void main(String[] args) {

		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
		
	}

}
