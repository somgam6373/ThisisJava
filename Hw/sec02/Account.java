package Hw.sec02;

public class Account {
	
	private int select;
	private String accountNum;
	private String name;
	private int money;

    public Account() {}

    public Account(String accountNum, String name, int money) {
        this.accountNum = accountNum;
        this.name = name;
        this.money = money;
    }
	
	public int getSelect() {
		return this.select;
	}
	
	public String getAccountNum(){
		return accountNum;
	}
	
	public void setAccountNum(String accountNum){
		this.accountNum = accountNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		if(money<0) {
			this.money = 0;
		}
		else {
		this.money = money;
		}
	}
	
	
	

}
