package ch06.study.s02;

public class Account {
	private final String accountNumber;
	private final String owner;
	private long balance;
	private long limit;
	private String status;
	
	/*
	public Account(String accountNumber, String owner) {
		this.accountNumber=accountNumber;
		this.owner = owner;
	}
	public Account(long balance, long limit, String status) {
		this.balance = balance;
		this.limit = limit;
		this.status = "ACTIVE";
	}
	*/
	public Account(String accountNumber, String owner) {
		this(accountNumber, owner, 1000000);
	}
	public Account(String accountNumber, String owner,long limit) {
		this.accountNumber=accountNumber;
		this.owner = owner;
		this.limit = limit;
		
		this.balance = 0;
		this.status = "ACTIVE";
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getLimit() {
		return limit;
	}
	public void setLimit(long limit) {
		this.limit = limit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
