package com.jatha.exceptionhandler;

import com.jatha.exceptionhandler.customexceptions.CheckoutException;

public class ApplicationRunner {
	
	
	
	public static void main (String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		try {
		shoppingCart.addItems("Anchor","Luxpray");
		}catch(CheckoutException ce) {
			ce.printStackTrace(System.out);
			
		}
		
		System.out.println("im running not crashed yet");
		
	}

}
