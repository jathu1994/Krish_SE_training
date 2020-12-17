package com.jatha.capitalizer.aftercorrection;

import java.io.FileReader;
import java.io.IOException;

//Using arithmetic logic to find capital letters
public class CapitalizedReader {

	public String readFile(String filePath) throws IOException {
		UpperCaseReader upperCaseReader = null;
		FileReader fileReader = null;
		StringBuilder capitalizedStringBuider = new StringBuilder();
		try {

			fileReader = new FileReader(filePath);
			upperCaseReader = new UpperCaseReader(fileReader);

			String currentRead;

			while ((currentRead = upperCaseReader.readLine()) != null) {
				System.out.println(currentRead);

			}

		} finally {
			if (fileReader != null) {
				fileReader.close();
			}

			if (upperCaseReader != null) {
				upperCaseReader.close();
			}

		}
		return capitalizedStringBuider.toString();
	}
}
