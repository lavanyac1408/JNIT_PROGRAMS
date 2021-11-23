package cursors;
import java.util.TreeSet;
import java.util.*;

public class iterator {

	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		System.out.println(hs.isEmpty());
		hs.add(new String("F"));
		hs.add("F");
		hs.add("R");
		hs.add("H");
		hs.add("B");
		hs.add("Y");
		hs.add("L");
		hs.add("");
		hs.add("F");
		hs.add("P");
		hs.add("E");
		hs.add("W");
		hs.add("K");
		hs.add("T");
		
			System.out.println(hs);
			
			Iterator<String> i=hs.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
	}

}
