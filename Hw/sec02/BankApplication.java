package Hw.sec02;

import java.util.Scanner;
import java.util.ArrayList;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        Account[] accounts = new Account[100];
        int accountCount = 0;
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int n = sc.nextInt();
			sc.nextLine(); 
			
			if(n==1) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				System.out.print("계좌번호: ");
				String accountNum = sc.nextLine();
				
				System.out.print("계좌주: ");
				String name = sc.nextLine();
				
				System.out.print("초기입금액: ");
				int money = sc.nextInt();
				sc.nextLine(); 
				
                Account a = new Account(accountNum, name, money);
                accounts[accountCount] = a;
                accountCount++;
				
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			else if(n==2) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
                for (int i = 0; i < accountCount; i++) {
                    Account a = accounts[i];
                    System.out.println(a.getAccountNum() + "   " + a.getName() + "   " + a.getMoney());
                }
			}
			else if(n==3) {
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				
				for(int i = 0; i < 100;i++)
				System.out.print("계좌번호: ");
				String accountNum = sc.nextLine();
				
				for(int i = 0;i<accountCount;i++) {
					
				if(accountNum.equals(accounts[i].getAccountNum())){
					System.out.print("예금액: ");
					int money = sc.nextInt();
					sc.nextLine(); 
					accounts[i].setMoney(accounts[i].getMoney()+money);
					System.out.println("잔액: " + accounts[i].getMoney());
					
					}
				}	
			}
			else if(n==4) {
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				
				System.out.print("계좌번호: ");
				String accountNum = sc.nextLine();
				for(int i = 0;i<accountCount;i++) {
				if(accountNum.equals(accounts[i].getAccountNum())){
					System.out.print("출금액: ");
					int money = sc.nextInt();
					sc.nextLine(); 
					accounts[i].setMoney(accounts[i].getMoney() - money);
					System.out.println("잔액: " + accounts[i].getMoney());
					}
				}
			}
			else if(n==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
