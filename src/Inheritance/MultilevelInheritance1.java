package Inheritance;
class GrandFather{
	void grandFather(){
		System.out.println("I am the grandfather");
	}
	void familyName() {
		System.out.println("Familyname is Brown");
	}
}
class Father extends GrandFather{
	void father(){
		System.out.println("I am the father and I inherit from Grandfather");
	}
	void homeaddress() {
		System.out.println("Home address is Irving");
	}
}
class Son extends Father{
	void son() {
		System.out.println("I am the son and I inherit from my father");
	}
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
	Son Rob=new Son();
	Rob.familyName();
	Rob.grandFather();
	Rob.homeaddress();
	Rob.father();
	Rob.son();
	}

}
