package ch07.study;

public class Student extends Person{
	
	private int studentId;
	@Override
	public void introduce() {
		System.out.println("나는 학생입니다.");
	}
	

}
