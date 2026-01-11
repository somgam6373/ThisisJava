package ch08.study.s04;

public abstract class OnlinePayment implements Payment{
	
	private String provider;
	
	public OnlinePayment(String provider) {
		this.provider = provider;
	}
	
	@Override
	public void printReceipt(int amount) {
		System.out.println("온라인 결제: " + provider);
		Payment.super.printReceipt(amount);
	}
	
	public abstract void authenticate();

}
