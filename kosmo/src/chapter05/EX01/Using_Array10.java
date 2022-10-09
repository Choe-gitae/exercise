package chapter05.EX01;

import java.util.Scanner;

public class Using_Array10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//국어 80 영어 50 수학 77 과학 88
		//전체 라인을 input 받아서 공백을 기준으로 잘라서 배열에 저장
		System.out.println("각 과목과 점수를 입력하세요.");
		String str = sc.nextLine();
		
		System.out.println(str);	//입력받은 문자열 출력
		
		String[] arr = str.split(" ");	//공백을 기준으로 잘라서 arr배열에 저장
		
		//배열 전체 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		//배열의 홀수 방의 값(정수)을 가져와서 합과 평균 구하기
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i%2 != 0) {	//홀수
				sum += Integer.parseInt(arr[i]);	//string to int
				count++;
			}
		}
		System.out.println("과목의 합 : "+sum);
		System.out.println("과목의 평균 : "+sum/(double)count);
		
		sc.close();
		
		
		
	}

}
