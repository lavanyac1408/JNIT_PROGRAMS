package constructors;
class Library1{
	int library1_bookyear;
	int library1_areapincode;
	
	Library1 (int x, int y){
	library1_bookyear=x;
	library1_areapincode=y;
}
	void display() {
		System.out.println("This Journal's publication year is="+library1_bookyear);
		System.out.println("This Fiction library area pincode is ="+library1_areapincode);
	}
}
public class ParameterizedConstructor2 {

	public static void main(String[] args) {
		Library1 journal=new Library1(2001,421301);
		journal.display();
		Library1 fiction=new Library1(2005,405278);
		fiction.display();
	}
}
