package com.jatha.exceptionhandler;

import java.io.FileNotFoundException;

public class GenerateBill{
	public void generate(double amount,String item_1,String item_2)  throws FileNotFoundException {
		//Change this to true or false to make it throw exception
		boolean logoFile = false;
		
		
		if (logoFile) {
			System.out.println(item_1);
			System.out.println(item_2);
			System.out.println("Total = " + amount);
			
		}
		else {
			throw new FileNotFoundException("seller logo not found"); 
		}
		
	}

}
