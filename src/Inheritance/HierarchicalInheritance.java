package Inheritance;
class Car{
	void start() {
		System.out.println("Starts with a key");
	}
}
class Audi extends Car{
	void audiFeature() {
		System.out.println("Audi is a luxury car");
	}
}
class Ferrari extends Car{
	void ferrariFeature() {
		System.out.println("Ferrari is a sports car");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.audiFeature();
		a.start();
		Ferrari f=new Ferrari();
		f.ferrariFeature();
		f.start();
	}
}
