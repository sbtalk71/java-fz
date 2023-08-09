package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		/*FileInputStream fis = null;
		try {
			fis = new FileInputStream("sample.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		try (FileInputStream  fis = new FileInputStream("sample.txt");){
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
