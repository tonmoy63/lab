package Hd1;

public class Rectangle {
	private int  length;
	private int  breadth;
 Rectangle(int length,int breadth){
	this.length=length;
	this.breadth=breadth;
}
public int getLength() {
 return length; 
} 
public void setLength(int length) { 
 this.length = length; 
 }
public int getBreadth() {
 return breadth; 
} 
public void setBreadth(int breadth) { 
 this.breadth = breadth; 
 } 
class RectangleTest{
	public static void main(String[] args) {
	Rectangle obj= new Rectangle(10,20);
	 int l = obj.getLength(); 
	  int b = obj.getBreadth();  
	  int Area= l*b;
	  System.out.println("Area: " +Area); 
	 obj.setLength(50); 
	 obj.setBreadth(60); 
	 int lt = obj.getLength(); 
	  int br = obj.getBreadth(); 
	 int newArea=lt*br;
	 System.out.println("New area: " +newArea); 
	
}}}