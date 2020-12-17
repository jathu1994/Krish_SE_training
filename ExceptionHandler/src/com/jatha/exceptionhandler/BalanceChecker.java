package com.jatha.exceptionhandler;

import com.jatha.exceptionhandler.customexceptions.CannotCheckBalanceException;
import com.jatha.exceptionhandler.customexceptions.CannotReachBankException;

public class BalanceChecker{
	public boolean checkBalance(double amount) throws CannotCheckBalanceException{
		
		BankConnector bankConnector = new BankConnector();
		
		boolean connStatus = false;
		
		try {
			connStatus = bankConnector.connectToBank();
		}catch(CannotReachBankException crbe) {
			throw new CannotCheckBalanceException("--failed to check Balance--", crbe);
		}
		return connStatus;
		
	}

}
