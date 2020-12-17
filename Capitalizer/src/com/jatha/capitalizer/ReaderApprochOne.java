package com.jatha.capitalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Using to upperCase Method
public class ReaderApprochOne {

	public String readFile(String filePath) throws IOException{
		BufferedReader bufferedReader = null; 
		FileReader fileReader = null;
		StringBuilder str = new StringBuilder();
		try {
			
			fileReader =new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			
			int currentRead; //int value of the last charecter by buffered reader will be stored here
			
			while ((currentRead = bufferedReader.read()) != -1) {
					
				char currentChar=  Character.toUpperCase((char)currentRead);
				str.append(currentChar);
				
			}
			
			}finally {
				if(fileReader != null) {
				fileReader.close();
				}
				
				if(bufferedReader !=null) {
				bufferedReader.close();
				}
				
			}
		return str.toString();
 }
}
