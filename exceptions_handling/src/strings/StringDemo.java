package strings;

import java.io.FileInputStream;

public class StringDemo {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		String s5=new String("hello");
		String s3="hello";
		String s4="Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1="hello world";
		
		System.out.println(s2==s5);
		
		System.out.println(s2.equals(s5));
		
		String sampleText="this is a java training class as java is simple language";
		
		/*
		 * 1. count the words in the sentence
		 * 2. count the letters in the sentence
		 * 4. locate first and last occurrence of java
		 * 5. Capitalize the sentence
		 * 6. extract 'training' from the sentence
		 * 7. replace java with python
		 * 
		 */
		
		
		
		
		

	}

}
