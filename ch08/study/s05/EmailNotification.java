package ch08.study.s05;

public class EmailNotification extends AbstractNotification{
	
	public EmailNotification(String sender) {
		super(sender);
	}
	
	@Override
	public void connect() {
		System.out.println("이메일 서버 연결 완료");
	}
	
	@Override
	public void send(String message) {
		Notification.isValid(message);
		connect();
		System.out.println("이메일 전송: " + message);
	}
	
}
