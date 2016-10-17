///Users/venky/git/JavaProgramming/JavaProgrammingQuestions
package com.Assignment4Files;
import java.io.*;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
	
		
		
		try {
			File myfile=new File("/Users/venky/Documents/Testfile51.txt");
			boolean file= myfile.createNewFile();
		   System.out.println("no file: " + file);
			FileWriter fw = new FileWriter (myfile.getPath(), true);
			fw.write("This is my first file");
		
			fw.close();
		} catch (IOException e) {
			
			System.out.println("error:" + e.getMessage());
		}
		
	}
}
