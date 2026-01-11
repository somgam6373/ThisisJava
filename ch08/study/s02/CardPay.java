package ch08.study.s02;

public class CardPay implements Payment{
	
	@Override
	public void pay(int amount) {
		System.out.println("카드로 " + amount + "원을 걸제합니다.");
	}

}
