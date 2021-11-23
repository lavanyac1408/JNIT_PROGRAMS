package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class limitmethod {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
			System.out.println(stringList);

		Stream<String> stream = stringList.stream();                  //one method
		stream.limit(2).forEach( element -> { System.out.println(element); });    
		
		stringList.stream().limit(2).forEach(element ->{           // second method
		System.out.println(element); });
		
	}

}
