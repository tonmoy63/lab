package Lab7;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input");
		  try{
	           
	            int x = sc.nextInt();
	           
	            int y = sc.nextInt();
	          
	            int z = x/y;
	            System.out.print(z);
	        }
	        catch(InputMismatchException e){
	            System.out.print("java.util.InputMismatchException");
	        }
	        catch(ArithmeticException e)
	        {
	        	 // Print exception
	            System.out.print(e);
	        }
	    }
	
	}




