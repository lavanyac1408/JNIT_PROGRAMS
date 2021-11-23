package thisNsuper;
import constructors.Child1;

class Child3 {
	int child3_age;
	float child3_height;
	
	Child3 (int child3_age, float child3_height){
		this.child3_age=child3_age;
		this.child3_height=child3_height;
	}
	void display() {
		System.out.println("Child3 age="+child3_age);
		System.out.println("Child3 height="+child3_height);
	}
}	
public class thiskeyword1 {

	public static void main(String[] args) {
		Child1 rahul =new Child1(12,4.2f);
		rahul.display();
		Child1 bob =new Child1(13,4.3f);
		bob.display();
	}
}
