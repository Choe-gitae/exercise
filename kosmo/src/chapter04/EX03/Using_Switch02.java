package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		//출력 : 주문하신 <메뉴>는 가격이 <가격>원 입니다.
		//에스프레소, 카페라떼, 아포카토 주문할 경우 가격이 3,500원
		//아메리카노 주문 할 경우 2,500원
		//그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		int price = 0;
		String menu;
		
		System.out.println("메뉴를 입력해주세요.");
		menu = sc.next();
		
		switch(menu) {
		case "아메리카노":
			price = 2500;
			System.out.printf("주문하신 %s는 가격이 %d원 입니다.\n",menu,price);
			break;
		case "에스프레소": case "카페라떼": case "아포카토":
			price = 3500;
			System.out.printf("주문하신 %s는 가격이 %d원 입니다.\n",menu,price);
			break;
		default:
			System.out.println("우리 매장에 없는 메뉴 입니다.");
		}
		sc.close();

	}

}
