package ch06.study.s02;
import java.util.Scanner;

public class AccountExample {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account account = new Account("202210962","Lee");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.print("1. deposit 2. withdraw 3. freezeAccount 4. changeLimit: ");
			int select = sc.nextInt();
			sc.nextLine();
			if(select == 1) {
				System.out.print("입금액: ");
				long depositAmount = sc.nextInt();
				sc.nextLine();
				deposit(depositAmount);
			}
			else if(select == 2) {
				System.out.print("출금액: ");
				long withdrawAmount = sc.nextInt();
				sc.nextLine();
				withdraw(withdrawAmount);
			}
			else if(select == 3) {
				freezeAccount();
			}
			else if(select == 4) {
				System.out.println("이체 한도 변경: ");
				long changeLimitNewLimit = sc.nextLong();
				changeLimit(changeLimitNewLimit);
			}
		}
		
	}

	
	private static void deposit(long amount) {
		if(amount>0) {
			account.setBalance(account.getBalance()+amount);
			System.out.println("현재 잔액: " + account.getBalance());
		}
	}
	
	private static void withdraw(long amount) {
		if(account.getStatus().equals("ACTIVE")) {
			if(amount > account.getLimit()) System.out.println("이체 한도 초과");
			else if(amount > account.getBalance()) System.out.println("잔액 부족");
			else account.setBalance(account.getBalance() - amount);
			System.out.println(amount + "만큼 잔액을 차감합니다.");
			System.out.println("현재 잔액: " + account.getBalance());
		}
		else System.out.println("출금 불가능한 계좌입니다.");
	}
	private static void freezeAccount() {
		System.out.println("계좌를 동결합니다.");
		account.setStatus("FROZEN");
	}
	private static void changeLimit(long newLimit) {
		if(newLimit < 0) System.out.println("한도가 0보다 작을 수 없습니다.");
		else if(newLimit < account.getBalance()) System.out.println("현재 작액보다 적게 설정할 수 없습니다.");
		else {
			account.setLimit(newLimit);
			System.out.println("이체 한도를 " + newLimit + "원 으로 변경합니다.");
		}

	}
}
