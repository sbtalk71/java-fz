package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person(100,"Pavan"));
		personSet.add(new Person(101,"Pavan"));
		personSet.add(new Person(102,"Pavan"));
		personSet.add(new Person(103,"Pavan"));
		personSet.add(new Person(104,"Pavan"));
		personSet.add(new Person(105,"Pavan"));
		personSet.add(new Person(106,"Pavan"));
		
		System.out.println(personSet);
		
		
		
	}

}
