package stringMethods;

public class StringMethods1 {

	public static void main(String[] args) {
		String greeting ="Hello String Methods";     //String
			System.out.println("Example of String = "+greeting);
		String txt ="Hello String Methods";   //String Length
			System.out.println("Length of String = "+txt.length());
		String hi ="This is Upper Case Method";   //String UpperCase
			System.out.println(hi.toUpperCase());
		String hii ="This is Lower Case Method";  //String LowerCase
			System.out.println(hii.toLowerCase());
		String hiii ="Finding a char in String";  //String indexOf
			System.out.println(hiii.indexOf("char"));
		String FirstName ="Rob";
		String LastName ="Mathews";
			System.out.println(FirstName+ " " +LastName); // String Concatenation
		String txt1 ="Java is based on \"Oops-Concept\""; 
			System.out.println("String Concatenation output ="+txt1);                     //Special Characters "/"
		String txt2 ="String Methods";                              //   charAt Method
		char output =txt2.charAt(4);
			System.out.println("charAt output is ="+output);
		String txt3="String Methods";
		int output1 =txt3.codePointAt(1);                          //codePointAt method
			System.out.println("codePointAt output ="+output1);
		String str3 = "viruscovid";                           //stringContains
		String str4 = "covid";
		String str5 = "plant";
			System.out.println("covid is a part of viruscovid:"+ str3.contains(str4));
			System.out.println("plant is a part of viruscovid:"+ str3.contains(str5));
		String str6 ="ThisabcprogramabcisabcStringabcMethods";    
		String[] split = str6.split("abc");							// String split()
		for (String obj: split) {
			System.out.println(obj);
			}
		}
	}

