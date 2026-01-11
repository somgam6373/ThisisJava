package ch08.study.s05;

public class NotificationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Notification[] n = new Notification[2];
		
		n[0] = new EmailNotification("학교");
		n[1] = new SmsNotification("집");
		
		for(int i = 0; i<n.length;i++) {
			n[i].send("hello");
			if(n[i] instanceof AbstractNotification a) {
				a.printInfo("!!");
			}
		}
	}

}
