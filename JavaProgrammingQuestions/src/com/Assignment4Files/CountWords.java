//b. Write a program to count the number of words in a file.
package com.Assignment4Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		String myfile="/Users/venky/Documents/Testfile1.txt";
		 FileReader fReader;
	        try {
	            fReader = new FileReader(myfile);
	            BufferedReader reader = new BufferedReader(fReader);
	            String cursor; 
	           String content = "";
	        
	            int words = 0;
	            
	       
	            while((cursor = reader.readLine()) != null){
	              
	                content += cursor;
	 
	                // count words
	                String [] _words = cursor.split(" ");
	                for( String w : _words)
	                {
	                  words++;        
	                }
	 
	           }
	        
	            System.out.println("Number of Words:"+ words );
	 
	            }
	        
	        catch (FileNotFoundException ex) {
	           // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	            System.out.println("File not found!");
	        } catch (IOException ex) {
	            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	             System.out.println("An error has occured: " + ex.getMessage());
	        }
	}
}