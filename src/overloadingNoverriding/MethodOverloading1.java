package overloadingNoverriding;
class University1 {
	void selectcolleges(String college,String college1) { 
		System.out.println("Selected colleges are "+college+" and "+college1);
	}
	void selectcolleges(float college1fees,float college2fees) { 
		System.out.println("Selected college fees are "+college1fees+" and "+college2fees);
	}
	void selectcolleges(String college,int collegeid) { 
		System.out.println("The first selected college is "+college+" and college id is "+collegeid);
	}
	void selectcolleges(int collegeid, String college) { 
		System.out.println("The second selected collegeid is "+collegeid+" and college is "+college);
	}
	}
public class MethodOverloading1 {

	public static void main(String[] args) {
		University1 texas=new University1();
		texas.selectcolleges("MIT","Harvard");
		texas.selectcolleges(2000.00f, 5000.00f);
		texas.selectcolleges("MIT", 2305);
		texas.selectcolleges("Harvard", 2306);
	}
}
