package com.jatha.capitalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Using arithmetic logic to find capital letters
public class ReadFileM2 {

	public String readingFile(String filePath) {
		BufferedReader bfr = null; 
		FileReader fr = null;
		try {
			
			fr =new FileReader(filePath);
			bfr = new BufferedReader(fr);
			
			int currentRead;//int value of the last charecter by buffered reader will be stored here
			StringBuilder str = new StringBuilder();
			while ((currentRead = bfr.read()) != -1) {
				//checking the charecter is small? using ASCII value
				if(currentRead >= 97 && currentRead <= 122 ) {
//				If it is small letter then deduct 32 to find it capital ascii notation	
				currentRead = currentRead - 32;
				}
//				char currentChar=  Character.toUpperCase((char)currentRead);
				str.append((char)currentRead);
				
			}
//			System.out.print(str);
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
