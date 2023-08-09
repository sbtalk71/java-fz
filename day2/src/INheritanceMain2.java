
public class INheritanceMain2 {

	public static void main(String[] args) {
		
		Employee e1= new Employee(100, "Karan", 56000);
		
		Employee e2= new Employee(100, "Karan", 56000);
		
		//System.out.println(e1==e2);
		
		System.out.println(e1.equals(e2));

	}

}
