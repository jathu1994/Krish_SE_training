package com.jatha.exceptionhandler.customexceptions;

public class CannotReachBankException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CannotReachBankException(String message) {
		super(message);
		
	}

}
