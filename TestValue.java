package com.kogent;
/*
 * author Tonmoy Halder
 * Write a Java program to test if an array contains a specific value.
 */
public class TestValue {
	 public static boolean check(int[] arr, int value) { 
	         for (int n : arr) { 
	         if (value == n) { //loop to check value
	         return true;
	         }}
	      return false;
	   }
	   public static void main(String[] args) {
	      int[] arr = {1789, 2035, 1899, 1456, 2013};//initialize array
	      System.out.println(check(arr, 2013));//check and print the array
	      System.out.println(check(arr, 2022));
	   }}



