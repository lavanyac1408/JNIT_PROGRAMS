package cursors;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class iteratorWith2elements {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm= new TreeMap<Integer,String>();
		hm.put(1023,"John");
		hm.put(1028,"Shiva");
		hm.put(1021,"Bob");
		hm.put(1020,"Rahul");
		hm.put(1025,"Mahesh");
		hm.put(1027,"John");
		hm.put(1020,"Dinesh");
		System.out.println(hm);
		Set<Integer> s=hm.descendingKeySet();
		Collection<String> co=hm.values();
			
		Iterator<Integer> i=s.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
				}
		Iterator<String> is=co.iterator();
			while(is.hasNext()) {
				System.out.println(is.next());
			}
		
	}

}
