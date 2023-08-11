package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<>();
		nameSet.add("james");
		nameSet.add("pavan");
		nameSet.add("Srikanth");
		nameSet.add("raji");
		nameSet.add("pavan");

		//nameList.add(3, "Raja");

		System.out.println(nameSet);

		nameSet.remove("raji");

		System.out.println(nameSet);

		// System.out.println(nameList.get(1));

		Iterator<String> itr = nameSet.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			if (name.length() < 6) {
				System.out.println(name);
			}
		}

		// =================For Each loop==========//
		for (String name : nameSet) {
			if (name.length() < 6) {
				System.out.println(name);
			}
		}

	}

}
