package com.jatha.capitalizer;

import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		ReaderApprochOne readerApprochOne = new ReaderApprochOne();
		ReaderApprochTwo readerApprochTwo = new ReaderApprochTwo();
		
		System.out.println("out put from ApprochOne using toUpperCase function");
		try {
			System.out.println(readerApprochOne.readFile("D:\\xxx.txt"));
		} catch (IOException e) {
//			e.printStackTrace();
			e.printStackTrace(System.out);
			System.out.println("file missing please make sure your file is available");
		}
		
		
		System.out.println("________________________________");
		
		
		
		System.out.println("out put from ApprochTwo using ASCII arithmatics");
		try {
			System.out.println(readerApprochTwo.readFile("D:\\xxx.txt"));
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace(System.out);
			System.out.println("file missing please make sure your file is available");
		}
	}

}