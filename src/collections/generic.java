package collections;
class Sample<X>{
	void show(X a) {
		System.out.println("a = "+a);
	}
}
public class generic {

	public static void main(String[] args) {
		Sample<Integer> i =new Sample<Integer>();
		i.show(1);
		i.show(20);
		i.show(4544);
		Sample<Double> d=new Sample<Double>();
		d.show(1.34);

	}
}
