package basic4;

class CalculatorExpr {
	private int num1;
	private int num2;
	
	CalculatorExpr(){}

	int getAddition() {
		return num1+num2;
	}
	int getSubtraction() {
		return num1-num2;
	}
	int getMultiplication() {
		return num1*num2;
	}
	double getDivision() {
		return num1/(double)num2;
	}//method
	
	int getNum1() {
		return num1;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	int getNum2() {
		return num2;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}// get set
	
}
