package collections;
import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
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
	}

}
