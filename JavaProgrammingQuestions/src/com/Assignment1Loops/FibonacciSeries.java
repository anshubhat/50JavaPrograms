/*a. Write a program that prints a fibonaci series that is a sequence of numbers 
 like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.
 */

package com.Assignment1Loops;
public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.print(n1+" "+n2);//printing 0 and 1 
		for (int i=0; i<count; i++){
			
			n3=n1+n2;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
		}
		
		

	}

}
