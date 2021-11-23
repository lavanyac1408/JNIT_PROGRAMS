package thisNsuper;
class Faculty2{
	Faculty2(int salary){
		System.out.println("Salary for all faculty is"+salary);
	}
}
class ScienceFaculty2 extends Faculty2{
	ScienceFaculty2(int bonus){
		super(4000);
		System.out.println("Bonus for ScienceFaculty is"+bonus);
	}
}
public class Superkeyword2 {
	
	public static void main(String[] args) {
		ScienceFaculty2 rob=new ScienceFaculty2(2000);
	}
}