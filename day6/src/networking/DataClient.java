package networking;

import java.net.*;
import java.io.*;

public class DataClient {
	public static void main(String args[]) throws Exception {
		// creating a datagram socket
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket rp, sp;
		
		// String s=" javapoint ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		byte arr[] = s.getBytes();
		// getting host address
		InetAddress inet = InetAddress.getLoopbackAddress();
// creating a DatagramPacket to send 
		sp = new DatagramPacket(arr, arr.length,inet,7777);
		System.out.println(" The String sending ..." + s + '\n');
		ds.send(sp);
// creating a DatagramPacket to recieve
		rp = new DatagramPacket(new byte[512], 512);
		// recieving the packet
		ds.receive(rp);
		// printing the data onto the screen
		System.out.print(new String(rp.getData()));
	}
}
