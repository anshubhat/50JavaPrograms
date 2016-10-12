//h. Write a program  that prints a pattern like below.
package com.Assignment1Loops;

public class PrintPattern {

	
	public void pattern(int pat){

		for (int i = 0; i < pat; i++) { 

		for (int j = 0; j < i ; j++) { 

		System.out.print("*"); } 

		System.out.println(); }

		}

		public static void main(String[] args) {

		PrintPattern patobj=new PrintPattern();

		patobj.pattern(10);

		}

		}

	
	