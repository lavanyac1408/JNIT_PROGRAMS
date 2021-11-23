package cursors;

import java.util.ArrayList;
import java.util.Spliterator;

public class spliterator {
	
	public static void main (String[] args) {
	ArrayList<String> al=new ArrayList<>();
	
	al.add("Ajay");
	al.add("Aarti");
	al.add("Binod");
	al.add("Binita");
	al.add("Chandran");
	al.add("Chandrika");
	al.add("Dorothy");
	al.add("Daniel");
	al.add("Elmore");
	al.add("Elizebeth");
	al.add("Fenry");
	al.add("Fiona");
	al.add("Gernard");
	
	System.out.println(al);
	
	Spliterator <String> spilterator1 = al.spliterator();
	Spliterator <String> spilterator2 = spliterator1.trySplit();
	
	
	spliterator1.forEachRemaining(System.out::println);
		
	System.out.println("--------------");
	
	spliterator2.forEachRemaining(System.out::println);
	
	
	}
}

	
