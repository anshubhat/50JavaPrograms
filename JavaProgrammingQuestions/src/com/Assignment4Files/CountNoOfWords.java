///Users/venky/git/JavaProgramming/JavaProgrammingQuestions
package com.Assignment4Files;
import java.io.*;
import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
	
		File myfile=new File("/Users/venky/Documents/TestOutPutFile.txt");
		//to write the file we need PrintWriter class
		/*try {
			PrintWriter addtext= new PrintWriter(myfile);
			addtext.println("Anshu");
			addtext.println("Hi");
			addtext.print("World");
			addtext.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		// to read the file we need scanner class
		try{
				Scanner sc = new Scanner(new FileInputStream(myfile));
		
				
				
		    int count=0;
		   while(sc.hasNext()){
		   sc.next();
		 count++;
		
		   }
		   System.out.println("Number of words: " + count);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
