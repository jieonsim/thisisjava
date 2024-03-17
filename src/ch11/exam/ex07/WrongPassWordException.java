package ch11.exam.ex07;

public class WrongPassWordException extends Exception {
	public WrongPassWordException() {}
	public WrongPassWordException(String message) {
		super(message);
	}
}
