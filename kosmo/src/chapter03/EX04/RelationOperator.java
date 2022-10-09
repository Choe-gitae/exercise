package chapter03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		//크기비교 : true, false로 값을 반환
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		//등가비교 : true, false로 값을 반환
		//	== : 같다 , != : 같지 않다
		int a=5;
		int b=2;
		int c=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
		System.out.println(a!=c);
		System.out.println();
		
		//참조 자료형일때 등가비교
		//	객체의 참조주소를 비교하므로 false
		String str1=new String ("안녕");
		String str2=new String ("안녕");
		System.out.println(str1==str2);

	}

}
