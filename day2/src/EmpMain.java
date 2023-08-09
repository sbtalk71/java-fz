
public class EmpMain {

	public static void main(String[] args) {
		
		Employee e= new Employee(100, "Karan", 56000);
		
		System.out.println(e.getDetails());
		
		Person p=new Employee(101, "Srinivas", 200000);
		
		System.out.println(p.getDetails());
		
		
		p=new TraineeEmp(101, "Srinivas", 200000,"good");
		
		System.out.println(p.getDetails());
		
		System.out.println(p);

	}

}
