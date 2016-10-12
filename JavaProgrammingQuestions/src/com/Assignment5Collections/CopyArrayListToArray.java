//g. Write a program to copy arraylist to an array.

package com.Assignment5Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListToArray {
	public void ArrayList(){

	List<String> arrobj=new ArrayList<String>();
	arrobj.add("Hello");
	arrobj.add("World");
	
	System.out.println("Arraylist is ::" + arrobj);
	
	String [] strobj=new String[(arrobj.size())];
	arrobj.toArray(strobj);
	System.out.println("Arraylist to Array");
	for(String s : strobj)
		System.out.println(s);
	
	}

	public static void main(String[] args) {
		CopyArrayListToArray copobj=new CopyArrayListToArray();
		copobj.ArrayList();

	}

}
