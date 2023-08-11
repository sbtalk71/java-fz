package collections;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("name", "Shantanu");
		props.setProperty("address", "Hyderabad");

		System.out.println(props);
		
		
		Properties sysProps=System.getProperties();
	}

}
