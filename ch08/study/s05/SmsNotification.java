package ch08.study.s05;

public class SmsNotification extends AbstractNotification{
	
	public SmsNotification(String sender) {
		super(sender);
	}
	
	@Override
	public void connect() {
		System.out.println("SMS 서버 연결 완료");
	}
	
	@Override
	public void send(String message) {
		System.out.println("SMS 전송: " + message);
	}
}
