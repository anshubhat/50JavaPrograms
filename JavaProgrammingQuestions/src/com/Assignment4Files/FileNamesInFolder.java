//e. Write a program to show list of all file names in a folder.
package com.Assignment4Files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileNamesInFolder {

	public static void main(String[] args) {
		List<String> results = new ArrayList<String>();


		File[] files = new File("/Users/venky/Documents").listFiles();
		
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		    System.out.println(file);
		}
		
       
	}

}
