package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
		// "그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int count = 0;
			int sum = 0;
			String str;
			
			System.out.println("원하는 정수를 공백을 이용하여 입력 하세요. '그만'을 입력하면 종료");
			str = sc.nextLine();
			if(str.equals("그만")) {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
				count++;
			}
			
			if(count == 0) {
				System.out.println("입력받은 정수값이 없습니다.");
			}else {
				System.out.printf("입력된 정수 : %d개 입니다.\n",count);
				System.out.printf("입력된 정수의 합 : %d 입니다.\n",sum);
				System.out.printf("평균 : %f\n",sum/(double)count);
			}
		}
		
		
	}

}
