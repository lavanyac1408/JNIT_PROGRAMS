package ifElseStatement;

public class IfElseLadder1 {

	public static void main(String[] args) {
		int English = 0, Maths = 0, Physics =0, Hindi =92, Telugu =74, Chemistry =71;
		
		int totalMarks = (English+Maths+Physics+Hindi+Telugu+Chemistry);
		
		int averageOfAllSubjects = totalMarks/6;
			System.out.println("Sum of all Subjects = "+ totalMarks);
			System.out.println("Average of all Subjects = "+ averageOfAllSubjects);
	
		if (averageOfAllSubjects>=75 ) {
			System.out.println("Grade A");
		}
			else if (averageOfAllSubjects> 60 && averageOfAllSubjects< 75) {
				System.out.println("Grade B");
		}
			else if (averageOfAllSubjects> 45 && averageOfAllSubjects< 60) {
				System.out.println("Grade C");
		}
		else
			System.out.println("Grade D - FAIL");
	}

}
