package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> personMap=new HashMap<>();
		
		personMap.put(100, "Kevin");
		personMap.put(101, "Shalu");
		personMap.put(102, "Kiran");
		personMap.put(103, "Ravi");
		
		System.out.println(personMap.containsKey(103));
		
		System.out.println(personMap.containsValue("Ravi"));
		
		System.out.println(personMap.get(103));
		
		Set<Integer> keys=personMap.keySet();
		
		for(Integer id:keys) {
			System.out.println(id+" : "+personMap.get(id));
		}

	}

}
