/*c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.*/

package com.Assignment1Loops;

public class SwapTwoNumbers {
	

	public void swap2Numbers(int x, int y){
		
		System.out.println("Before swap: " + x);
		System.out.println("Before swap:" + y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap: " + x);
		System.out.println("After swap:" + y);
	}
	
	public void swapThirdVar(int a, int b){
	
		System.out.println("*****************");
		System.out.println("Before swap: " + a);
		System.out.println("Before swap:" + b);
		 int temp= a;
		 a=b;
		 b=temp;
		 System.out.println("After swap: " + a);
			System.out.println("After swap:" + b);
		
	}

	public static void main(String[] args) {
		SwapTwoNumbers swapobj=new SwapTwoNumbers();
		swapobj.swap2Numbers(4, 9);
		swapobj.swapThirdVar(7, 3);
		
	}

}
