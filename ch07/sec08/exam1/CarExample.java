package ch07.sec08.exam1;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		/*
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		*/
		//메소드의 매개변수에 부모 객체를 사용
		HankookTire h = new HankookTire();
		myCar.run(h);
		
		KumhoTire k = new KumhoTire();
		myCar.run(k);
	}

}
