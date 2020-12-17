package com.jatha.capitalizer.aftercorrection;

import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		
		CapitalizedReader capitalizedReader = new CapitalizedReader();
		
		System.out.println("out put from ApprochOne using toUpperCase function");
		try {
			System.out.println(capitalizedReader.readFile("D:\\xxx.txt"));
		} catch (IOException e) {
			e.printStackTrace(System.out);
			System.out.println("file missing please make sure your file is available");
		}
		
		
		System.out.println("________________________________");
	}

}
