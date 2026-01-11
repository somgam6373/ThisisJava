package ch11.study.s01;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) throws InsufficientbalanceException{
		if(amount>balance)
			throw new InsufficientbalanceException("잔액이 부족합니다.");
		else
			System.out.println("출금 완료");
	}

}
