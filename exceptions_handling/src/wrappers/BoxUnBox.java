package wrappers;

public class BoxUnBox {

	public static void main(String[] args) {
		
		//prior to java 1.5
		int x=10;
		Integer i= new Integer(x); //Boxing process
		
		int y = i.intValue(); //UnBoxing
		
		//Java 1.5 onwards
		
		Integer a=x; //Auto Boxing
		
		int b=a; //Auto Un Boxing

	}

}
