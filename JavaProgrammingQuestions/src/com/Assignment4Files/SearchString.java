/*c. Write a program to search for a string in a file 
  and then return the count of number of occurrences of the string.*/
 
package com.Assignment4Files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class SearchString 
{

		public static void main(String[] args) throws FileNotFoundException {
			
			
			String myfile="/Users/venky/Documents/TestFile.txt";
			 FileReader fReader;
		        try {
		            fReader = new FileReader(myfile);
		            BufferedReader reader = new BufferedReader(fReader);
		            String cursor; 
		           String content = "";
		        
		            String search="Hello";
		            int occurance=0;
		       
		            while((cursor = reader.readLine()) != null){
		              
		                content += cursor;
		 
		                // count words
		                String []_words = cursor.split(" ");
		                for( String w : _words)
		                {
		                  
		                  if (w.equalsIgnoreCase(search)){
		                	  occurance++;
		                  }
		                }
		
		           }
		        
		          
		            System.out.println("Number of Occurance:"+ occurance );
		 
		            }
		        
		        catch (FileNotFoundException ex) {
		           
		            System.out.println("File not found!");
		        } catch (IOException ex) {
		            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		             System.out.println("An error has occured: " + ex.getMessage());
		        }
		}
	}