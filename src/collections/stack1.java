package collections;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		Stack <Integer> s=new Stack<>();
		s.push(34);
		s.push(23);
		s.push(54);
		s.push(67);
		s.push(37);
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}
