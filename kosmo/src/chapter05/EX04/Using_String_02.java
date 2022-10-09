package chapter05.EX04;

public class Using_String_02 {

	public static void main(String[] args) {

		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1 == str4);	//false
		System.out.println(str2 == str3);	//true
		System.out.println(str1.equals(str2));	//true
	}

}
