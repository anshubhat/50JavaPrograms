//g. Write a program  that accepts input from the command line and then prints them.

package com.Assignment1Loops;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
	 Scanner scanobj=new Scanner(System.in);
		System.out.println("Enter your name :");
		String username=scanobj.next();
		System.out.println("Enter your age :");
		Integer age=scanobj.nextInt();
		
		System.out.println(username + "your age is  " + age);

	}

}
