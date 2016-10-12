//c. Write a program implementing explicit garbage collection.
package com.Assignment8General;

public class GarbageCollection {
	
	public static String Greeting(String str){
		
		return str;
	}
		

	public static void main(String[] args) {
		GarbageCollection garobj=new GarbageCollection();
		String str="hello";
		System.out.println(str);
		str=null;
		System.gc();
		System.out.println(str);
		
	}

}
