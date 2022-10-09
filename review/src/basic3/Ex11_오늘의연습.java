package basic3;

public class Ex11_오늘의연습 {
	
	static boolean checkLower(char ch) {
		return Character.isLowerCase(ch);
	}
	
	static char checkUpper(char ch) {
		return Character.toUpperCase(ch);
	}
	
	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char ch) {
		for (int i = 0; i < a; i++) {
			System.out.print(ch);
		}
	}
	static void multiple(int a, int b, char ch) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.println(checkLower('a'));
		System.out.println(checkUpper('b'));
		multiple(2, 3);
		multiple(4, 'ㅋ');
		System.out.println();	//갱
		multiple(2, 3, 'ㅋ');
	}//main

}
