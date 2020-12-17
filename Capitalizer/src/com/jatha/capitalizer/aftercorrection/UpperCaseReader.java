package com.jatha.capitalizer.aftercorrection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class UpperCaseReader extends BufferedReader {

	public UpperCaseReader(Reader reader) {
		super(reader);
	}
	
	@Override
	public String readLine() throws IOException {
		String thisLine = super.readLine();
		if(thisLine == null) {
			return null;
			
		}
		else {
			return thisLine.toUpperCase();
		}
		
	}
	

}
