package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If {

	public static void main(String[] args) {
		//문제 : Scanner로 국어aa, 영어bb, 수학cc, 과학dd, 음악ee 점수 input
		//if문을 사용해서 평균이 90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		int aa, bb, cc, dd, ee;
		
		System.out.println("점수를 입력하세요. 국어, 영어, 수학, 과학, 음악");
		aa = sc.nextInt();
		bb = sc.nextInt();
		cc = sc.nextInt();
		dd = sc.nextInt();
		ee = sc.nextInt();
		
		double avg = (aa+bb+cc+dd+ee)/5.0;
		
		System.out.println("평균점수 : "+avg);
		
		if(avg>=90) {
			System.out.println("A학점 입니다.");
		}else if(avg>=80) {
			System.out.println("B학점 입니다.");
		}else if(avg>=70) {
			System.out.println("C학점 입니다.");
		}else if(avg>=60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}

		sc.close();
	}

}
