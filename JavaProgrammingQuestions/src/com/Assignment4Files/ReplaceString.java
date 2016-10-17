//d. Write a program to search for a string in a file and then replace it with another string.

package com.Assignment4Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReplaceString {

	 public static void main(String args[]){
	
	
	   // ArrayList<String> lines = new ArrayList<String>();
	
	    try {
	    	  String myfile = ("/Users/venky/Documents/TestFile.txt");
	             BufferedReader breader = new BufferedReader(new FileReader(myfile));
	             String line = ""; 
	             String oldtext = "";
	             while((line = breader.readLine()) != null)
	                 {
	                 oldtext += line + "\r\n";;
	                		 
	                	//	 
	             }
	             breader.close();
	             // replace a word in a file
	             //String newtext = oldtext.replaceAll("drink", "Love");
	            
	             //To replace a line in a file
	             String newtext = oldtext.replaceAll("Google", "Hello");
	            
	             FileWriter fwriter = new FileWriter("/Users/venky/Documents/TestFile.txt");
	             fwriter.write(newtext);
	             fwriter.close();
	         }
	         catch (IOException ioe)
	             {
	             ioe.printStackTrace();
	         }
	     }
	
}