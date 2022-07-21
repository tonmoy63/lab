package com.kogent;
/*
 * author Tonmoy Halder
 * Write a Java program to find the duplicate values of an array of integer values.
 */
public class DuplicateValue {
	  public static void main(String[] args) {      
	    int [] arr = new int [] {5,2,7,7,5};   //Initialize array     
	          
	        System.out.println("Duplicate value in array: ");  
	        for(int i = 0; i < arr.length; i++) {     //loop,searches for duplicate value 
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  //condition
	                    System.out.println(arr[j]);  //print the value
	            }}}
}
