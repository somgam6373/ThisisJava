package ch08.study.s05;

public abstract class AbstractNotification implements Notification{
	private String sender;
	
	public AbstractNotification(String sender) {
		this.sender = sender;
	}
	
	@Override
	public void printInfo(String message) {
		System.out.println("발신자: " + this.sender);
		Notification.super.printInfo(message);
	}

	public abstract void connect();
}
