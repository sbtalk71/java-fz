package interfaces;

public interface MyConnection {

	String releaseVersion="1.0.1";
	
	public void getConnection();
	public void getDBVersion();
	
	default void getDataInfo() {
		System.out.println("Not Yet Implemented..");
	}
}
