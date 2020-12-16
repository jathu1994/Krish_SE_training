package com.jatha.capitalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Using to upperCase Method
public class ReadFileM1 {

	public String readingFile(String filePath) {
		BufferedReader bfr = null; 
		FileReader fr = null;
		try {
			
			fr =new FileReader(filePath);
			bfr = new BufferedReader(fr);
			
			int currentRead; //int value of the last charecter by buffered reader will be stored here
			StringBuilder str = new StringBuilder();
			while ((currentRead = bfr.read()) != -1) {
					
				char currentChar=  Character.toUpperCase((char)currentRead);
				str.append(currentChar);
				
			}
			return str.toString();
			
			
			

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (bfr != null)
					bfr.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
		ex.printStackTrace();
   }
  }
		return null;
 }
}
