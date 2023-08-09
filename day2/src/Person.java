import java.util.Objects;

public class Person {

	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public String getDetails() {
		return id+" "+name;
	}
	
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName()+":"+this.id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
	
	
}
