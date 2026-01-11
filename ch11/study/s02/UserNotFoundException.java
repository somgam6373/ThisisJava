package ch11.study.s02;

public class UserNotFoundException extends AuthException{
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
