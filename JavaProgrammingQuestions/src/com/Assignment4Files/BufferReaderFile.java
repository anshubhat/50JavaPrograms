//BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.

package com.Assignment4Files;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderFile {

	public static void main(String[] args) {
		
	    try {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a ;
		    int b ;
		    System.out.print("Enter First Number A : ");
			a=Integer.parseInt(br.readLine());
			  System.out.print("Enter First Number B : ");
			  //Converting input data
			  b=Integer.parseInt(br.readLine());
			int diff=a-b;
			   
			  System.out.println("Difference is : " + diff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	  
	}
}