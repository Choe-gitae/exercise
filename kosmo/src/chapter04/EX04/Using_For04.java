package chapter04.EX04;

public class Using_For04 {

	public static void main(String[] args) {
		
		//이중 for문 사용하기 (for문 내부의 for문)
		for(int i=0; i<5; i++) {	//5번 반복
			for(int j=0; j<10; j++) {	//10번 반복
				System.out.println("i:"+i+" j:"+j);
			}
			System.out.println();
		}
		
	}

}
