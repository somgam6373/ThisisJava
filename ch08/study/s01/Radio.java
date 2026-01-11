package ch08.study.s01;

public class Radio implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
	}

}
