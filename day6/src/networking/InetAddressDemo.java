package networking;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getLocalHost();

		System.out.println(address);

		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());

		InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");

		for (InetAddress a : allAddresses) {
			System.out.println(a.getHostName() + " : " + a.getHostAddress());
		}
		
		
		
		//System.out.println(InetAddress.getByAddress(ipAddr.getBytes()));
	}

}
