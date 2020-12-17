package com.jatha.exceptionhandler;

import com.jatha.exceptionhandler.customexceptions.CannotReachBankException;

public class BankConnector {
	boolean connectionStatus = false;
	public boolean connectToBank() throws CannotReachBankException {
		if(connectionStatus) {
		return connectionStatus;
		}
		else {
			throw new CannotReachBankException("--connection to bank database failed--");
		}
	}
	

}
