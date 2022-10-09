package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If04 {

	public static void main(String[] args) {
		//출력 : 주문하신 <메뉴>는 가격이 <가격>원 입니다.
		//에스프레소, 카페라떼 주문할 경우 가격이 3,500원
		//아메리카노 주문 할 경우 2,500원
		//그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 입력해 주세요.");
		String order = sc.next();
		
		int price = 0;
		
		if(order.equals("아메리카노")) {
			price = 2500;
			System.out.println("주문하신 "+order+"는 가격이 "+price+"원 입니다.");
		}else if(order.equals("에스프레소") || order.equals("카페라떼")) {
			price = 3500;
			System.out.println("주문하신 "+order+"는 가격이 "+price+"원 입니다.");
		}else {
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		sc.close();

	}

}
