package collections;
import java.util.Objects;

public class Person {

	private int id;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	
	
	
	public String getDetails() {
		return id+" "+name;
	}
	
	@Override
	public String toString() {
		
		return id+" "+name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called...");
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
