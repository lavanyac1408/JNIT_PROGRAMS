package constructors;
class Child{
	int child_age;
	float child_height;
	
	Child (){
	child_age=12;
	child_height=4.2f;
}
	void display() {
		System.out.println("Child age="+child_age);
		System.out.println("Child height ="+child_height);
	}
}
public class ZeroArgumentConstructor1 {

	public static void main(String[] args) {
		Child rahul=new Child();
		rahul.display();
	}
}
