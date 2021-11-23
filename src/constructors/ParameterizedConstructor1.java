package constructors;
class Child1 {
	int child1_age;
	float child1_height;
	
	Child1 (int x, float y){
		child1_age=x;
		child1_height=y;
	}
	void display() {
		System.out.println("Child1 age="+child1_age);
		System.out.println("Child1 height="+child1_height);
	}
}	
public class ParameterizedConstructor1 {

	public static void main(String[] args) {
		Child1 rahul =new Child1(12,4.2f);
		rahul.display();
		Child1 bob =new Child1(13,4.3f);
		bob.display();
	}
}

