package Inheritance;
class Electronics{
	void circuit() {
		System.out.println("Intel processor");
	}
}
class Laptop extends Electronics{
	void battery() {
		System.out.println("2.5 amps battery");
	}
}
class Dell extends Laptop{
	void ram() {
		System.out.println("Dell insprion ram is 8gb");
	}
	void hardDisk() {
		System.out.println("Dell insprion hard disk is 1Tb");
	}
}
public class MutlilevelInheritance {

	public static void main(String[] args) {
		Dell insprion=new Dell();
		insprion.circuit();
		insprion.battery();
		insprion.ram();
		insprion.hardDisk();
	}
}
