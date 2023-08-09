package exceptions;

public class NotAnEvenException extends RuntimeException {

	public NotAnEvenException() {
		
	}

	public NotAnEvenException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()+":"+super.getMessage();
	}

}
