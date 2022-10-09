package chapter07.EX04;

class Car{
	String company;		// 제조회사
	String model;		// 모델이름
	String color;		// 색깔
	double maxSpeed;	// 최대 출력
	
	Car(){};
	Car(String company, String model, String color, double maxSpeed){
		this.company = company;
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	void show(){
		System.out.printf("%s , %s , %s , %4.2f\n",company,model,color,maxSpeed);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// car1 현대자동차 그랜져		필드값 직접 입출력
		// car2 쌍용자동차 체어맨		생성자로 필드값 입력 show() 출력
		// car3 기아자동차 k9		setter / getter 입출력
		
		Car car1 = new Car();
		car1.company = "현대자동차";
		car1.model = "그랜져";
		car1.color = "White";
		car1.maxSpeed = 300.01;
		System.out.printf("%s , %s , %s , %4.2f\n",car1.company,car1.model,car1.color,car1.maxSpeed);
		
		Car car2 = new Car("쌍용자동차", "체어맨", "Black", 300.02);
		car2.show();
		
		Car car3 = new Car();
		car3.setCompany("기아자동차");
		car3.setModel("K9");
		car3.setColor("Red");
		car3.setMaxSpeed(300.03);
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
		
	}

}
