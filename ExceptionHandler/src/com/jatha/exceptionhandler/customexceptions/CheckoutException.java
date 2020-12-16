package com.jatha.exceptionhandler.customexceptions;

public class CheckoutException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CheckoutException(String message, Throwable cause) {
		super(message,cause);

}
}
