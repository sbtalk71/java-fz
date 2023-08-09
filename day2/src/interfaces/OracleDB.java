package interfaces;

public class OracleDB implements MyConnection{

	public void getConnection() {
		System.out.println("Oracle Connected...");
	}
	
	
	public void getDBVersion() {
		System.out.println("Version : 12c");
	}
}
