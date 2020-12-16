package com.jatha.exceptionhandler;

import java.io.FileNotFoundException;

import com.jatha.exceptionhandler.customexceptions.CannotCheckBalanceException;
import com.jatha.exceptionhandler.customexceptions.PaymentException;

public class Payment {
	public void proceedPayment(double amount,String item_1,String item_2) throws PaymentException{
		BalanceChecker bc = new BalanceChecker();
		
		
		boolean status = false;
		try {
			status = bc.checkBalance(amount);
		}catch (CannotCheckBalanceException ex) {
			throw new PaymentException("--cannot make payment for cart--", ex);
			
		}
		
		
		if (status) {
			GenerateBill gb =  new GenerateBill();
			try {
			gb.generate(amount,item_1,item_2);
			}catch(FileNotFoundException e){
				e.printStackTrace();
				
			}
			
		}
	}

}
