package ch11.study.s02;

public class AccountLockedException extends RuntimeException{
	public AccountLockedException(String message) {
		super(message);
	}

}
