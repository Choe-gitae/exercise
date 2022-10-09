package test;

public final class BankAccount{

	private final String ACCOUNT;		//예금주
	private final String ACCOUNT_NUM;	//계좌번호
	private long money;					//잔액
	
	public BankAccount(String ACCOUNT, String ACCOUNT_NUM, int money){
		this.money = money;
		this.ACCOUNT = ACCOUNT;
		this.ACCOUNT_NUM = ACCOUNT_NUM;
	}//생성자
	
	public void withdrawal(int i) {
		if((money-i) >= 0) {
			money -= i;
			System.out.println("인출한 금액 : "+i);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void deposit(int i) {
		this.money += i;
		System.out.println("입금한 금액 : "+i);
	}
	
	@Override
	public String toString() {
		return "예금주:"+ACCOUNT+", 계좌번호:"+ACCOUNT_NUM+", 잔액:"+money;
	}//메소드
	
	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("최기태","123-456789",1000);
		account1.deposit(500);
		account1.withdrawal(1000);
		account1.withdrawal(6000);
		System.out.println(account1);
		
	}//main
}
