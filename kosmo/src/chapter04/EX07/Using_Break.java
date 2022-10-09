package chapter04.EX07;

public class Using_Break {

	public static void main(String[] args) {
		// break; 해당 구문{}을 탈출할 때 사용, if 조건과 같이 사용
		// 	- 1단계만 탈출
		// for , while , do while 반복문을 탈출할 때 사용
		
		// 1. 단일 loop에서 탈출
		for (int i=0; i<10; i++) {
			System.out.println(i);
			break;						//한단계 탈출
		}
		
		System.out.println("=====================");
		//break는 for , while , do while 내에서 if 조건문과 같이 사용
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) break;	
		}
		
		System.out.println("=====================");
		// 2. 다중 loop문에서 break 사용
		// case 1: 하나의 loop문만 탈출
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) break;		//하나의 for문 탈출
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("===========false==========");
		// case 2: 한꺼번에 탈출 (변수의 값을 조건이 false가 나오도록 하는 방법)
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i = 100;	//바깥쪽 for문의 변수값을 증가 시켜서 한꺼번에 탈출
					break;		//하나의 for문 탈출
				}
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("===========label==========");
		// case 3: 한꺼번에 탈출 (label을 사용해서 탈출)
		jump: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					break jump;		
				}
				System.out.println(i+","+j);
			}
		}
		
		
	}

}
