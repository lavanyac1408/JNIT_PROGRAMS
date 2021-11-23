package thisNsuper;
class Parent{
	int age=54;
}
class Child2 extends Parent{
	int age=22;
	void ageDetails() {
		System.out.println("Parent age is"+super.age);
		System.out.println("Child age is"+age);
	}
}
public class Superkeyword {

	public static void main(String[] args) {
		Child2 x=new Child2();
		x.ageDetails();
	}

}
