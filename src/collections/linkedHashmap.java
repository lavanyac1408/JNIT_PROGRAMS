package collections;

import java.util.LinkedHashMap;

public class linkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
		hm.put(1023,"John");
		hm.put(1028,"Shiva");
		hm.put(1021,"Bob");
		hm.put(1020,"Rahul");
		hm.put(1025,"Mahesh");
		hm.put(1027,"John");
		hm.put(1020,"Dinesh");
		System.out.println(hm);
		
	}

}
