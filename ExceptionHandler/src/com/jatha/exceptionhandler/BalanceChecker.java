package com.jatha.exceptionhandler;

import com.jatha.exceptionhandler.customexceptions.CannotCheckBalanceException;
import com.jatha.exceptionhandler.customexceptions.CannotReachBankException;

public class BalanceChecker{
	public boolean checkBalance(double amount) throws CannotCheckBalanceException{
		
		ConnectBank bank = new ConnectBank();
		
		boolean connStatus = false;
		
		try {
			connStatus = bank.connectToBank();
		}catch(CannotReachBankException crb) {
			throw new CannotCheckBalanceException("--failed to check Balance--", crb);
		}
		return connStatus;
		
	}

}
