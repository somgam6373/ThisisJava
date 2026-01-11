package ch11.study.s01;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(10000);
		
		try {
			account.withdraw(20000);
		}catch(InsufficientbalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
