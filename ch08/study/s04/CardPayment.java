package ch08.study.s04;

public class CardPayment extends OnlinePayment{
	
	public CardPayment(String provider) {
	    super(provider);
	}

	
	@Override
	public void authenticate() {
		System.out.println("카드 인증 완료");
	}
	
	@Override
	public void pay(int amount) {
		authenticate();
		double result = (double) amount + Payment.calculateTax(amount);
		System.out.println("카드 결제 완료: " + result + "세금 포함");
	}

}
