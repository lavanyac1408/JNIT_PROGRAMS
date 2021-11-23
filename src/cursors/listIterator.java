package cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
	
	public static void main (String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(34);
	al.add(87);
	al.add(24);
	al.add(52);
	al.add(12);
	al.add(67);
	al.add(35);
	al.add(54);
	al.add(98);
	al.add(24);
	al.add(88);
	al.add(32);
	al.add(16);
	System.out.println(al);
	
	ListIterator <Integer> li=al.listIterator();
	
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("------------------------");
	
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
}
	
}
