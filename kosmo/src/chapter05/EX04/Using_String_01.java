package chapter05.EX04;

public class Using_String_01 {

	public static void main(String[] args) {

		// String : 참조 데이터 타입 , 문자열을 처리, 특별한 기능들이 많이 들어가 있다.
		
		// 1. 객체 생성을 사용해서 값을 할당 (별도의 주소를 사용)
		String str1 = new String("안녕");
		System.out.println(str1);
		
		String str11 = new String("안녕");
		System.out.println(str11);
		System.out.println(str1 == str11);		//false : 객체의 주소값이 틀리다
		System.out.println(str1.equals(str11));	//true : 객체의 값이 같다
		
		// 2. 리터럴로 값을 할당 (객체의 주소를 공유)
		//		리터럴 : 변수에 들어가는 값을 통칭해서 리터럴이라 한다
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		String str22 = "안녕하세요";
		System.out.println(str22);
		System.out.println(str2 == str22);		//true : 객체의 주소값을 공유
		System.out.println(str2.equals(str22));	//true : 객체의 값이 같다
		
		
	}

}
