package constructors;
class Library{
	int library_year;
	float library_id;
	
	Library(){
	library_year=2001;
	library_id=4.2f;
}
	void display() {
		System.out.println("Library year="+library_year);
		System.out.println("Library id="+library_id);
	}
}
public class ZeroArgumentConstructor2 {

	public static void main(String[] args) {
		Library book=new Library();
		book.display();
	}
}
