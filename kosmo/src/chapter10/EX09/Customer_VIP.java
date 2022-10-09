package chapter10.EX09;

public class Customer_VIP extends Customer{
	
	private int agentID;
	
	Customer_VIP(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		super.customerGrade = "VIP";
		super.bonusRatio = 0.5;
		super.bonusPoint = 10;
	}
	
}
