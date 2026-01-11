package ch08.study.s04;

public class KakaoPay extends OnlinePayment{
	public KakaoPay(String provider) {
	    super(provider);
	}

	
	@Override
	public void authenticate() {
		System.out.println("카카오 인증 완료");
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("카카오페이 결제 완료: " + amount);
	}

}
