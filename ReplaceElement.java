package Lab8;
/*
 * @author Tonmoy Halder
 * Write a Java program to replace an element in a linked list.
 */

import java.util.LinkedList;

public class ReplaceElement {

	public static void main(String[] args) {
		//creating a linked list
		LinkedList<String> arr=new LinkedList<String>();
		//adding values
		arr.add("TonmoY");
		arr.add("MasuD");
		arr.add("ViraT");
		arr.add("SuvO");
		arr.set(2, "PujA");//replace 2position 
		System.out.println("after replacing:");
		System.out.println(arr);//print list
	}


}
