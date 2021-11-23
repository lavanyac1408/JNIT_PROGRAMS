package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mapmethodNONTERMINAL {

	public static void main(String[] args) {
		
		//without streams
		List<String> vehicles =Arrays.asList("bus", "car", "bicycle", "flight", "train");
		
		for (String name: vehicles)
		{
			System.out.println(name + "="+ name.length());
		}

		
		//using streams
		
		System.out.println(vehicles.stream());
		
		vehicles.stream().map(vname ->vname.length()).forEach(len->System.out.println(len));
		
		vehicles.stream().map(vname ->vname.length()).forEach(System.out::println);
	
		  

		
	}

}
