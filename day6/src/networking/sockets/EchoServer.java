package networking.sockets;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("Waiting for incomming connection...");

		Socket socket = ss.accept();

		System.out.println("Connected to " + socket);

		InputStream is = socket.getInputStream();

		DataInputStream dis = new DataInputStream(is);
		String line = "";
		while (!(line = dis.readUTF()).equalsIgnoreCase("exit")) {
			System.out.println("Server : " + line);
		}

		System.out.println("Server is now Closed..");
	}

}
