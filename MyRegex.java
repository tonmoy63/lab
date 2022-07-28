package String;

import java.util.regex.Pattern;

public class MyRegex {
	String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";//logic
    String pattern= regex + "." + regex + "." + regex + "." + regex;
    void check (String p) {//to check the pattern
    	boolean t = Pattern.matches(pattern,p);
    	System.out.println(t);
    	
    }
}
class Regex{
	public static void main(String args[]) {
		MyRegex h=new MyRegex();//creating object
		h.check("000.12.12.034");//check method
		h.check("121.234.12.12");
		h.check("23.45.12.56");
		h.check("00.12.123.123123.123");
		h.check("122.23");
		h.check("Hello.IP");
	}
}