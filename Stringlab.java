package String;
public class Stringlab {
	public static void main(String []args) {
		String t="Welcome to Java World";//creating string object 
		System.out.println("character at 5th possition: "+t.charAt(5));//5th index character
		System.out.println("compare:"+t.compareTo("Welcome"));//comparing
		System.out.println("concat:"+t.concat("-Let us learn"));//concatenates 
		System.out.println("position of a: "+t.indexOf("a"));//first accurence of a
		System.out.println("replace a to e: "+t.replace('a', 'e'));//replacing a by e
		System.out.println("return string 4-10 position: "+t.substring(4,10));//string between 4 to 10
		System.out.println("lowercase: "+t.toLowerCase());//print lowercase
	
     StringBuffer h=new StringBuffer ("This is StringBuffer");//declare stringbuffer
     System.out.println("adding: "+h.append("-This is a sample program"));//adding
     System.out.println("insert: "+h.insert(21," Object "));//inserting in possition 21
     System.out.println("replace: "+h.replace(14, 20,"Builder"));//replace 14 19 index
     
     StringBuilder p=new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
     
     System.out.println("Drive: "+p.substring(0, 3));//print 0 to 2 index
     System.out.println("Folders: "+p.substring(3,6).concat("||")+p.substring(7, 10).concat("||")+p.substring(11, 18).concat("||"));
     System.out.println("File: "+p.substring(20));
}
}