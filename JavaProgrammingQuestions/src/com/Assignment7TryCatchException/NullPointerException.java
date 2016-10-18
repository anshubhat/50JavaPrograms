package com.Assignment7TryCatchException;

public class NullPointerException {

	public static void main(String[] args) {
		 	        System.out.println("This statement will be executed"); 
		 
		        String s = null;
		  try {
			  System.out.println(s.length()); 
				 
		        System.out.println("This statement will not be executed");
			
		} catch (Exception e) {
			System.out.println("Exception Caught");
		}
		        
	}
}
	

		