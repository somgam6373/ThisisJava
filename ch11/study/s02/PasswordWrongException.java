package ch11.study.s02;

public class PasswordWrongException extends AuthException{
	public PasswordWrongException(String message) {
		super(message);
	}
}
