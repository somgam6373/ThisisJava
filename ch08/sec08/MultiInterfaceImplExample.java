package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable s = new SmartTelevision();
		s.search("naver.com");
	}

}
