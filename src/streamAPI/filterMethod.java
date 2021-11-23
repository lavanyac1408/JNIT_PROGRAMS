package streamAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filterMethod {

	public static void main(String[] args) {
		
		//Q create a list and filter all even numbers from list
				
		ArrayList <Integer> li= new ArrayList<>();
		li.add(12);
		li.add(13);
		li.add(17);
		li.add(29);
		li.add(26);
					
		//filter all even numbers
		//without stream
		
	    ArrayList<Integer> listEven= new ArrayList<>();
		
		for (Integer i:li)
		{ 
			if (i%2==0) {
				listEven.add(i);
		}
	}
		System.out.println(li);
		System.out.println(listEven);
	
		//using stream	
	    
		Stream<Integer> ddd= li.stream();
		List<Integer> newList = ddd.filter(i-> i %2==0).collect(Collectors.toList());   //first method
		System.out.println(newList);
	}
}
