package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> nameList=new Vector<>();
		
		nameList.add("james");
		nameList.add("pavan");
		nameList.add("Srikanth");
		nameList.add("raji");
		
		nameList.add(3,"Raja");
		
		System.out.println(nameList);
		
		nameList.remove("raji");
		
		System.out.println(nameList);
		
		//System.out.println(nameList.get(1));
		
		Iterator<String> itr=nameList.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			if(name.length()<6) {
				System.out.println(name);
			}
		}
		
		//=================For Each loop==========//
		for(String name:nameList) {
			if(name.length()<6) {
				System.out.println(name);
			}
		}
		
		Enumeration<String> en=nameList.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		ListIterator<String> lstr=nameList.listIterator();
		
		while(lstr.hasNext()) {
			System.out.println(lstr.next());
		}
		
		while(lstr.hasPrevious()) {
			System.out.println(lstr.previous());
		}
		
	}

}
