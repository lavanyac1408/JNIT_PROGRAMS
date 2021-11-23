import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class sample {

	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");

		Stream <String> stream = items.stream(); 
	
		stream.forEach( element -> { System.out.println(element); });
		
	}
}

