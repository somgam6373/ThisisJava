package ch08.study.s04;

public interface Payment {
	
	double TAX_RATE = 0.1;
	
	void pay(int amount);
	
	default void printReceipt(int amount) {
		System.out.println("결제 금액: " + amount);
	}
	
	static double calculateTax(int amount) {
		double result;
		result = amount * TAX_RATE;
		return result;
	}
}
