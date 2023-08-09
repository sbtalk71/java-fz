package interfaces;

public class DBMain {

	public static void main(String[] args) {
	
		/*
		 * MySQLDB db= new MySQLDB();
		 * 
		 * db.getConnection(); db.getVersion();
		 */

		/*
		 * OracleDB db = new OracleDB();
		 * 
		 * db.getOracleConnection(); db.getOracleVersion();
		 */
		
		
		MyConnection db=new MySQLDB();
		
		db.getConnection();
		db.getDBVersion();
	}

}
