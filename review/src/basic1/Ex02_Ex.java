package basic1;

import java.util.Scanner;

public class Ex02_Ex {

	public static void main(String[] args) {
		/*
		 * 우리대학의 학번은 총 10자리로 되어 있습니다.
		 * 맨 앞의 4자리는 입학년도이고
		 * 다섯번째 문자는 단과대 번호입니다.
		 * 1:공대 2:사회대
		 * 
		 * 그 뒤의 2자리는 각 학과번호입니다.
		 * 공과대학인 경우는 11: 컴퓨터학과 / 12 : 소프트웨어학과 / 13 : 모바일학과 / 22 : 자바학과 / 33 : 서버학과
		 * 사회대학인 경우는 11: 사회학과 / 12 : 경영학과 / 13 : 경제학과
		 * 
		 * ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다 
		 * ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다 
		 * ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다
		 */
		
		String studentId = null;	// 변수 학번
		
		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요.");
		studentId = input.nextLine();
		input.close();
		
		String year = studentId.substring(0, 4);	// 변수 연도 // 학번 substring
		char collageNum = studentId.charAt(4);		// 변수 대학번호
		String departmentNum = studentId.substring(5, 7);	// 변수 학과번호
		
		String collage = null;	// 변수 대학명
		String department = null;	// 변수 학과명
		
		if(collageNum == '1') {			// 대학번호 조건
			collage = "공대";				// 대학번호 기준 대학명 대입
			switch (departmentNum) {	// 학과번호 기준 학과명 대입
			case "11": department = "컴퓨터학과"; 	break;
			case "12": department = "소프트웨어학과"; break;
			case "13": department = "모바일학과"; 	break;
			case "22": department = "자바학과"; break; 
			case "33": department = "서버학과"; break;
			}
		}//if
		else if(collageNum == '2') {	// 대학번호 조건
			collage = "사회대";			// 대학번호 기준 대학명 대입
			switch (departmentNum) {	// 학과번호 기준 학과명 대입
			case "11": department = "사회학과"; break;
			case "12": department = "경영학과"; break;
			case "13": department = "경제학과"; break;
			}
		}//else if
		System.out.println(studentId+" 는 "+year+"년도에 입학한 "+collage+" "+department+" 학생입니다.");
		
	}

}
