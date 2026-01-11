package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 실행자 실행 됨");
	}
}
