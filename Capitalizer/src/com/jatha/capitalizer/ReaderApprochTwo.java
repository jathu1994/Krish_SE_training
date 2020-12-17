package com.jatha.capitalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Using arithmetic logic to find capital letters
public class ReaderApprochTwo {

	public String readFile(String filePath) throws IOException{
		BufferedReader bufferedReader = null; 
		FileReader fileReader = null;
		StringBuilder capitalizedStringBuider = new StringBuilder();
		try {
			
			fileReader =new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			
			int currentRead;//int value of the last charecter by buffered reader will be stored here
			
			while ((currentRead = bufferedReader.read()) != -1) {
				//checking the charecter is small? using ASCII value
				if(currentRead >= 97 && currentRead <= 122 ) {
//				If it is small letter then deduct 32 to find it capital ascii notation	
				currentRead = currentRead - 32;
				}
				capitalizedStringBuider.append((char)currentRead);
				
				}
			
			}finally {
				if(fileReader != null) {
					fileReader.close();
					}
					
					if(bufferedReader !=null) {
					bufferedReader.close();
					}
				
			}
		return capitalizedStringBuider.toString();
	}
}
