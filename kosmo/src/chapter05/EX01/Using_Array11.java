package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//탁구 2 야구 9 축구 11 농구 6 씨름 2
		//각 종목의 구성원 수의 합과 평균
		do {
			String str;	//문자열 변수선언
			String[] strArr;	//문자열배열 변수선언
			int sum = 0;	//정수형 변수선언
			int count = 0;	//카운트 변수선언
			
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요 >>>");
			str = sc.nextLine();	//Scanner input
			
			if(str.equals("그만")) {	//"그만" 입력받으면 break
				break;
			}
			
			strArr = str.split(" ");	//str문자열변수를 공백으로 나눠서 strArr배열변수에 저장
			
			for (int i = 1; i < strArr.length; i+=2) {	//정수 입력부분 반복
				sum += Integer.parseInt(strArr[i]);	//string to int	합계 계산
				count++;	//평균을 위한 카운트
			}
			
			System.out.println("구성원의 합 : "+sum);	//합 출력
			System.out.println("구성원의 평균 : "+sum/(double)count);	//평균 출력
		}while(true);	//무한루프
		sc.close();	//Scanner Close
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
