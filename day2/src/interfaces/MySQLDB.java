package interfaces;

public class MySQLDB implements MyConnection{

	public void getConnection() {
		System.out.println("MySQL Connected...");
	}
	
	
	public void getDBVersion() {
		System.out.println("Version : 8.1.5");
	}
}
