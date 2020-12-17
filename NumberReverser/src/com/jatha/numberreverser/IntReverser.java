package com.jatha.numberreverser;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntReverser {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		int number = 0;	
		
		while (loop) {
		
		System.out.println("Enter a number");
		try {
		number = scanner.nextInt();
		}
		catch(InputMismatchException ex) {
		System.out.println("please input only Integers");	
		System.out.println("Enter a number");
		scanner.nextLine();
		number = scanner.nextInt();	
			
		}
		
		if(number == -1) {
			loop =false;
			break;
		}
		
		if(number >0) {
			IntReverser intReverser = new IntReverser();
			
			intReverser.reverseInt(number);
			
		}else {
			System.out.println("Enter a number grater than 0");
		}
	    
		
		}
	}
		
	public void reverseInt(int receivedNumber) {
		ArrayList<Integer> reversedNumber = new ArrayList<Integer>();
		while(receivedNumber>0) {
			
			int remainder = receivedNumber%10;
			reversedNumber.add(remainder);
			receivedNumber/=10;		
		}
		
		for (Integer num : reversedNumber) { 		      
	           System.out.print(num); 		
	      }
		System.out.println();
	}

}
