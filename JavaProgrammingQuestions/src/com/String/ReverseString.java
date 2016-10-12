//a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.

package com.String;

public class ReverseString {
	
	public static void main (String[] arg){
		String str="Anshu Bhat";
		for (int i=0; i<str.length(); i++){
			System.out.print(str.charAt(i));
		 }
		 System.out.println("");
	   for(int j = str.length() - 1; j >= 0; j--)
	 {
		   System.out.print(str.charAt(j)); 
         
 }

}
	
}
