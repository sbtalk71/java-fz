package networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws Exception {
		
		URL url=new URL("http://www.google.co.in");
		
		URLConnection uconn= url.openConnection();
		uconn.connect();
		
		InputStream input=uconn.getInputStream();
		
		System.out.println(input.available());
		
		int data=0;
		while((data=input.read())!=-1) {
			System.out.print((char)data);
		}
		
		

	}

}
