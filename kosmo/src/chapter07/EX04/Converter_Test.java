package chapter07.EX04;

import java.util.Scanner;

// 환율 계산 클래스
class Converter{
	// 1. 필드
	double rate;	// 환율
	
	// 2. 메소드
	/// toKor() 달러 인풋 원화 반환
	double toKWR(double doller) {
		return doller * this.rate;
	}
	/// toDaller() 원화 인풋 달러 반환
	double toDoller(double kor) {
		return kor / this.rate;
	}
	
	// 3. setter / getter
		/// setRate() : rate 할당
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}

public class Converter_Test {

	public static void main(String[] args) {
		// 스캐너로 환율 인풋
		// 원화 100만원 to 달러 출력
		// 달러 100달러 to 원화 출력
		Converter converter = new Converter();		// 환율 객체 선언
		
		Scanner sc = new Scanner(System.in);		// 스캐너 객체 선언
		System.out.println("원화:달러 환율을 입력하세요");
		converter.setRate(sc.nextDouble());			// setter 환율 입력
		sc.close();
		
		// System.out.printf() 사용 출력
		System.out.printf("%.2f 원\n",converter.toKWR(100));				// 100달러 to 원화
		System.out.printf("%.2f 달러\n",converter.toDoller(1000000));	// 100만원 to 달러

		// 지역변수에 더블값 할당 후 소숫점 2자리까지 변환 예시
		double per2 = 3.141592;
		// Double.parseDouble():String to Double , String.format():return String
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		double d2 = converter.toDoller(1000000);
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println(d1+" 달러");
		
		d2 = converter.toKWR(100);
		d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println(d1+" 원");
		
	}

}
