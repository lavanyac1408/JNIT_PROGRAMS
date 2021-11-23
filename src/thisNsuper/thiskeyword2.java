package thisNsuper;
class Library2{
	int library2_bookyear;
	int library2_areapincode;
	
	Library2 (int library2_bookyear, int library2_areapincode){
	this.library2_bookyear=library2_bookyear;
	this.library2_areapincode=library2_areapincode;
}
	void display() {
		System.out.println("This Journal's publication year is="+library2_bookyear);
		System.out.println("This Fiction library area pincode is ="+library2_areapincode);
	}
}
public class thiskeyword2 {

	public static void main(String[] args) {
		Library2 journal=new Library2(2001,421301);
		journal.display();
		Library2 fiction=new Library2(2005,405278);
		fiction.display();
	}
}
