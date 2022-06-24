//Author: Tonmoy Halder

import java.util.Scanner; //Import the scanner class
class inputfromuser {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); //Create a Scanner object
    String userName;
    System.out.println("Enter username"); 
    userName = myObj.nextLine();  //Read user input 
       
    System.out.println("Username is: " + userName);  //Output user input      
  }
}
