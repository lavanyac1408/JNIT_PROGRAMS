import java.util.ArrayList;
import java.util.stream.Stream;

public class ss {

	public static void main(String[] args) {
		ArrayList <Integer> li= new ArrayList<>();
		li.add(12);
		li.add(13);
		li.add(17);
		li.add(29);
		li.add(26);
		
		Stream<Integer> in=li.stream();
		in.forEach( element -> {System.out.println(element); });
	
   }
 }
