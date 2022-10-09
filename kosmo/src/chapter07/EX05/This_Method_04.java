package chapter07.EX05;

class Car{
	String companyName;
	String color;
	double maxSpeed;
	
	Car(){
		companyName = "현대자동차";
		color = "검은색";
		maxSpeed = 200.0;
	}
	Car(String companyName){
		this();
		this.companyName = companyName;
	}
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed){
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	
	void print() {
		System.out.printf("%s %s %.1fkm/h\n",companyName,color,maxSpeed);
	}
}

public class This_Method_04 {

	public static void main(String[] args) {

		// 1. 기본생성자 출력
		Car car1 = new Car();
		car1.print();
		
		// 2. 매개변수 1개 companyName
		Car car2 = new Car("벤츠");
		car2.print();
		
		// 3. 매개변수 2개 companyName , color
		Car car3 = new Car("페라리","레드");
		car3.print();
		
		// 4. 매개변수 3개 companyName , color , maxSpeed
		Car car4 = new Car("LG엠트론","국방색",6.5);
		car4.print();
		
	}

}
