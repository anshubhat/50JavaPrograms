package com.Assignment3String;

//e. Write a program to check for a palindrome (MADAM, DAD) string.
//import java.util.Scanner;

public class PalindromeString {

	//public static void palStr( )
	public static void main(String[] args)  
	{
	      String original="dad", reverse = "";
	   
	 
	      for ( int i = original.length() - 1; i >= 0; i-- ){
	    	  
	    	 reverse=reverse + original.charAt(i);
	    
	      }
	      
	     System.out.println(reverse);
	     
	      if (original.equals(reverse)){
	    
	      
	         System.out.println("It is a palindrome.");}
	      else
	      {
	         System.out.println("Not a palindrome.");
	 
	       } 
	
	}	
}
/*    public static void main(String[] args) {
	
		PalindromeString.palStr();
		
	}
*/
 


