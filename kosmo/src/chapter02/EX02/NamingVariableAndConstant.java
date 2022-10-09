package chapter02.EX02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		
		/* 변수의 이름 부여 : 변수 : 값을 변경 가능
			- 첫자는 소문자
			- 특수문자 : _ , $
			- 첫자에 숫자는 올수 없음.
			- JAVA의 Keyword(예약어)는 올 수 없다. (int, double, String 등등)
		 */
		boolean aBcD;	//aBcD 변수에 True 와 False 값만 사용가능
		aBcD=true;
		System.out.println(aBcD);
		aBcD=false;
		System.out.println(aBcD);
		byte 가나다;		//사용은 가능 하나 권장 사항이 아니다
		short _abcd;	//특수문자는 _ , $ 사용가능
		char $ab_cd;
		double main;	//메소드 이름을 변수 이름으로 사용가능
		//float int;	//예약어를 변수명으로 사용하면 오류 발생
		String myClassName;	//첫단어는 소문자, 여러 단어가 있을시 첫단어 대문자
		
		
		/* 변수의 이름 부여 : 상수 : 값을 변경 불가능
			상수의 이름 부여
			- 대문자로 처리
			- 변수 선언문 앞에 final 키워드를 사용
		 */
		final double PI;
		PI=3.141592;
		System.out.println(PI);
		//PI=1234.00;	//상수는 값을 수정할 수 없다.
		System.out.println(PI);
		
		final int MY_DATA;	//상수 단어 사이 언더바_
		int myData;			//변수 첫단어 대문자

	}

}
