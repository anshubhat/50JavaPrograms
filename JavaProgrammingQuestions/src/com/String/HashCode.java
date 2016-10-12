package com.String;

public class HashCode {

	public static void main(String[] args) {
		String str1="Madam";
		String str2="Madam1";
		
		System.err.println( str1.hashCode());
		 if (str1.equals(str2))
			 System.out.println("Equal");
			 else 
				 System.out.println("Not Equal") ;

	}

}
