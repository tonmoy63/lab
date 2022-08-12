package Lab8;
/*
 * @author Tonmoy Halder
 * Write a Java program to insert the specified element at the front of a linked list.
 */
import java.util.LinkedList;

public class LinkesListeg {
	public static void main(String[] args) {
		//creating an linked list
		LinkedList<String> arr=new LinkedList<String>();
		//adding values
		arr.add("Tonmoy");
		arr.add("Sahil");
		arr.add("Masud");
		arr.add("Messi");
		//adding element to first position
		arr.addFirst("Puja");
		System.out.println("after adding:");
		System.out.println(arr);//print linked list

	}

}

