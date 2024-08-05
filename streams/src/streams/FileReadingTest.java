package streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("D:\\aurionpro\\streams\\src\\streams\\MYFILE");
		
		BufferedReader br = new BufferedReader(new FileReader(MYFILE)) {
			String currLine = br.readLine();
			int lineCount = 0;
			int wordCount = 0;
			int charCount = 0;
		}
			 while (currLine != null) {
		            l++; 
		            String words[] = currLine.split;  //words
	                wordCount += words.length;    
	                
		            characterCount += words.length();  //characters
		            
		            currLine = br.readLine(); //read the next line             
		}
		        System.out.println("Total line count = " + lineCount);
		        System.out.println("Total word count = " + wordCount);
		        System.out.println("Total char count = " + charCount);

		}
}
