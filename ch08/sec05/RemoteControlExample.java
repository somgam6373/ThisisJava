package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.setMute(true);
		rc.setMute(false);
	}
}
