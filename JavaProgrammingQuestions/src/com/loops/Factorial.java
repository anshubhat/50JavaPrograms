/*d. Write a program  to calculate factorial of a given number. You need to compute the factorial with 
one logic that uses recursion and another logic without recursion*/

package com.loops;

public class Factorial {

		 int fact(int n)
		   {
		       int output;
		       if(n==1){
		         return 1;
		       }
		       //Recursion: Function calling itself!!
		       output = fact(n-1)* n;
		       return output;
		   }
		
	public void factWithOutRec(int n){
	
	       int result=1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       System.out.println("The factorial of given number " + result);
	   }
	

	
	public static void main(String[] args) {
		Factorial factobj=new Factorial();
		factobj.factWithOutRec(5);
		System.out.println (factobj.fact(4));
		
	}

}
