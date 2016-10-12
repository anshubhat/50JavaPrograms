/*e. Write a program that contains a constructor, a static block and a static method. Execute 
the program in order to verify the order to execution of methods and block.
  		f. Write a program to make use of JDBC and insert/update/select values in the database.*/


package com.Assignment8General;

public class StaticConstructorMethod {
	
	static int num;
	static String str;
	String name;
	
	public  StaticConstructorMethod(String name){
		this.name=name;
		System.out.println("static Constructor " + name);
				
	}
	static {
		num=97;
		str="test";
	System.out.println("Static block");
	}
	
	public static void method1(String name){
		
		System.out.println("static Method  " + name);
				
	}

	public static void main(String[] args) {
		StaticConstructorMethod.method1("Anshu");
		
		System.out.println(num + str);
		
		StaticConstructorMethod c=new StaticConstructorMethod("hi");
	
	}

}
