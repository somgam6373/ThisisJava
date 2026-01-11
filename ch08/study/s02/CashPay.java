package ch08.study.s02;

public class CashPay implements Payment{
	
	@Override
	public void pay(int amount) {
		System.out.println("현금으로 " + amount + "원을 걸제합니다.");
	}

}
