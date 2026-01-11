package ch08.study.s05;

public interface Notification {

	int MAX_LENGTH = 100;
	
	void send(String message);
	
	default void printInfo(String message) {
		System.out.println("알림 내용: " + message);
	}
	
	static boolean isValid(String message) {
		if(message.length()<MAX_LENGTH)
			return true;
		else
			return false;
	}
	
}
