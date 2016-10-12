//b. Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.

package com.Assignment8General;

public class SortNumbersWithoutLoop {

	public static  void sortNum(int n) 
	{ 
		 
		  if(n <= 10) {
		 
		       System.out.print(n); 
		       sortNum(n+1);  //n=n+1
		      }
		}
		 
		public static void main(String args[]) 
		{
		 
		sortNum(1); 
		 
		 }
}