package String;

public class StringCheck {
	public static String check(String p) {
		if 
		(p.matches("[a-z]+_+[a-z]+$"))//logic
			return"Found a match";
		else 
			return "Not matched";

}
	public static  void main(String args[]) {
		System.out.println(check("java_exercises"));
		System.out.println(check("Java_Exercises"));
	}
	}
