package networking;

import java.net.*;
import java.io.*;

public class DataServer {
	public static void main(String args[]) throws Exception {
		System.out.println("CRATING THE SERVER SOCKET ");
		DatagramPacket rp, sp;
		rp = new DatagramPacket(new byte[512], 512);
		
		DatagramSocket ds = new DatagramSocket(7777);
		
		
		System.out.println(" DONE ");
		while (true) {
			System.out.println(" WAITING FOR THE packet... ");
			ds.receive(rp);
			System.out.println(" GOT THE CLIENT packet ");
			byte[] b1 = rp.getData();
			int l = rp.getLength();

			String str = new String(b1, 0, l);
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			String msg = sb.substring(0) + "-----" + str;
			byte[] b = msg.getBytes();
			/*
			 * sp=new DatagramPacket
			 * (rp.getData(),rp.getLength(),rp.getAddress(),rp.getPort());
			 */
			System.out.println("Server is Sending "+b.length);
			sp = new DatagramPacket(b, b.length, rp.getAddress(), rp.getPort());
			ds.send(sp);
		}
	}
}