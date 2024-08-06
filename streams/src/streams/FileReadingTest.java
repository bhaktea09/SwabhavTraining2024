package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
		// Specify the file path
		String filePath = "D:\\aurionpro\\streams\\src\\streams\\MYFILE.txt";

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String currLine;

		
			while ((currLine = br.readLine()) != null) {
				lineCount++;
				String[] words = currLine.split("\\s+"); 

				wordCount += words.length; 

				charCount += currLine.length(); 
			}

			System.out.println("Total line count = " + lineCount);
			System.out.println("Total word count = " + wordCount);
			System.out.println("Total char count = " + charCount);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
