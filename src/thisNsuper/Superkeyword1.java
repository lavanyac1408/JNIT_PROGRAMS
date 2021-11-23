package thisNsuper;
class Faculty1{
	Faculty1(){
		System.out.println("Salary for all faculty is $4000");
	}
}
class ScienceFaculty1 extends Faculty1{
	ScienceFaculty1(){
		super();
		System.out.println("Bonus for ScienceFaculty is $2000");
	}
}
public class Superkeyword1 {

	public static void main(String[] args) {
		ScienceFaculty1 rob=new ScienceFaculty1();
	}

}
