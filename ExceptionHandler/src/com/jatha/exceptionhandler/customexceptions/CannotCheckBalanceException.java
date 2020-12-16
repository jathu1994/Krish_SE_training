package com.jatha.exceptionhandler.customexceptions;

public class CannotCheckBalanceException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;

		public CannotCheckBalanceException(String message, Throwable cause) {
			super(message,cause);
			
		}


}
