package com.jatha.exceptionhandler;

import java.io.FileNotFoundException;

import com.jatha.exceptionhandler.customexceptions.CannotCheckBalanceException;
import com.jatha.exceptionhandler.customexceptions.PaymentException;

public class Payment {
	public void proceedPayment(double amount,String item_1,String item_2) throws PaymentException{
		BalanceChecker balanceChecker = new BalanceChecker();
		
		
		boolean status = false;
		try {
			status = balanceChecker.checkBalance(amount);
		}catch (CannotCheckBalanceException ccbe) {
			throw new PaymentException("--cannot make payment for cart--", ccbe);
			
		}
		
		
		if (status) {
			BillGenerator gb =  new BillGenerator();
			try {
			gb.generate(amount,item_1,item_2);
			}catch(FileNotFoundException fnf){
				fnf.printStackTrace(System.out);
				
			}
			
		}
	}

}
