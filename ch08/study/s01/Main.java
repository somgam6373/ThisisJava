package ch08.study.s01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new TV();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.turnOff();
	}

}
