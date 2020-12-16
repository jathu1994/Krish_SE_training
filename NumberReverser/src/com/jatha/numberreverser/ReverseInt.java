package com.jatha.numberreverser;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInt {
	
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
			ReverseInt rv = new ReverseInt();
			
			rv.reverseInt(number);
			
		}else {
			System.out.println("Enter a number grater than 0");
		}
	    
		
		}
	}
		
	public void reverseInt(int x) {
		ArrayList<Integer> revnum = new ArrayList<Integer>();
		while(x>0) {
			
			int z = x%10;
			revnum.add(z);
			x/=10;		
		}
		
		for (Integer num : revnum) { 		      
	           System.out.print(num); 		
	      }
		System.out.println();
	}

}
