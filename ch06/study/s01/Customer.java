package ch06.study.s01;

public class Customer {
	private String id;
	private int point = 0;
	
	public Customer(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
