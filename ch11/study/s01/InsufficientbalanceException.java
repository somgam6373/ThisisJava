package ch11.study.s01;

public class InsufficientbalanceException extends RuntimeException{
	public InsufficientbalanceException(String message) {
		super(message);
	}
}
