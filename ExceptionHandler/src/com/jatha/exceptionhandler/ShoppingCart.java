package com.jatha.exceptionhandler;

import com.jatha.exceptionhandler.customexceptions.CheckoutException;
import com.jatha.exceptionhandler.customexceptions.PaymentException;

public class ShoppingCart {
	
	
	public void addItems (String item_1 , String item_2) throws CheckoutException{
		double amount = 600;
		Payment pay = new Payment();
		
		try {
		pay.proceedPayment(amount, item_1 , item_2);
		}catch (PaymentException pe) {
			throw new CheckoutException("--Failed to checkout--", pe);
		}
		
		
	}

}
