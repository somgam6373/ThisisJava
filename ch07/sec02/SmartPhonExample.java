package ch07.sec02;

public class SmartPhonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		System.out.println("모델: "+myPhone.model);
		System.out.println("색상: "+myPhone.color);
		
		System.out.println("와이파이상태: "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendvocie("여보세요");
		myPhone.receiveVoice("안녕하세요 ! 저는 홍길동인데요.");
		myPhone.sendvocie("아~네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
