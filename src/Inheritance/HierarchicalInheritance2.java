package Inheritance;
class Mobile1{
	void start() {
		System.out.println("Mobile starts with the help of battery");
	}
}
class Apple1 extends Mobile1{
	void apple1feature() {
		System.out.println("Apple operating system is IOS");
	}
}
class Samsung extends Mobile1{
	void samsungfeature() {
		System.out.println("Samsung operating system is Android");
	}
}
public class HierarchicalInheritance2 {

	public static void main(String[] args) {
		Apple1 a=new Apple1();
		a.apple1feature();
		a.start();
		Samsung b=new Samsung();
		b.samsungfeature();
		b.start();
	}
}
