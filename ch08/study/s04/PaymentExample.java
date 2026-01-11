package ch08.study.s04;

public class PaymentExample {
	private static Payment[] payment = new Payment[2]; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment[0] = new CardPayment("VISA");
		payment[1] = new KakaoPay("KAKAO");
		int[] amounts = {10000,20000};
		
		for(int i = 0; i< payment.length; i++) {
			payment[i].pay(amounts[i]);
			
			if(payment[i] instanceof OnlinePayment onlinepayment) {
				onlinepayment = (OnlinePayment) payment[i];
				onlinepayment.printReceipt(amounts[i]);
			}
			System.out.println();
		}
	}

}
