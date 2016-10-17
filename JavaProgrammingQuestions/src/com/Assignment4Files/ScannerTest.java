package com.Assignment4Files;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number A:");
		a=s.nextInt();
		System.out.println("Enter Number B:");
		b=s.nextInt();
		int sum=a+b;
		System.out.println("Sum of Two Numbers:" + sum);
		s.close();
		
	}

}
