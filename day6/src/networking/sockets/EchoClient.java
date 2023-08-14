package networking.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		Socket sc = new Socket("localhost", 8888);

		OutputStream os = sc.getOutputStream();

		DataOutputStream dos = new DataOutputStream(os);
		DataInputStream kbin = new DataInputStream(System.in);
		String line = "";

		while (!(line = kbin.readLine()).equalsIgnoreCase("exit")) {
			dos.writeUTF(line);
		}

		
	}
}
