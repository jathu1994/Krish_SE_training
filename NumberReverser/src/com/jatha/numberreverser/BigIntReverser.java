package com.jatha.numberreverser;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BigIntReverser {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		BigInteger number;	
		
		while (loop) {
		
		System.out.println("Enter a number");
		try {
		number = new BigInteger(scanner.nextLine());
		}
		catch(NumberFormatException ex) {
		System.out.println("please input only Integers");	
		System.out.println("Enter a number");
		number = new BigInteger(scanner.nextLine());
			
		}
		
		if(number.equals(BigInteger.valueOf(-1))) {
			loop =false;
			break;
		}
		
		if(number.signum()==1) {
			BigIntReverser bigIntReverser = new BigIntReverser();
			bigIntReverser.reverseInt(number);
			
		}else {
			System.out.println("Enter a number grater than 0");
		}
	    
		
		}
	}
		
	public void reverseInt(BigInteger number) {
		ArrayList<BigInteger> reversedNumber = new ArrayList<BigInteger>();
		while(number.signum()==1) {
			
			BigInteger for10 = new BigInteger("10");
			BigInteger remainder = number.mod(for10);
			reversedNumber.add(remainder);
			number = number.divide(for10);
		}
		
		for (BigInteger num : reversedNumber) { 		      
	           System.out.print(num); 		
	      }
		System.out.println();
	}

}
