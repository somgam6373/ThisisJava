package Hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		
		while(true) {
			
			int n;
			
			System.out.println("\n-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------\n");
			
			System.out.print("선택> ");
			String ch = sc.nextLine();
			
			
			if(ch.equals("1")){
				System.out.print("예금액> ");
				n = sc.nextInt();
                sc.nextLine();
				money +=n;
				System.out.println("잔고> "+money);
				
			}
			else if(ch.equals("2")) {
				System.out.print("출금액> ");
				n = sc.nextInt();
                sc.nextLine();
				money -= n;
				System.out.println("잔고> "+money);
			}
			else if(ch.equals("3")) {
				System.out.println("잔고> "+money);
			}
			else if(ch.equals("4")) {
				System.out.println("프로그랭 종료");
				break;
			}
			
		}
	}

}
