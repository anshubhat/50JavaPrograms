//f. Write a program to copy content of file into another file.
package com.Assignment4Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyFile {

	public static void main(String[] args) {
    
    	try{
 
    	    File sourcefile =new File("/Users/venky/Documents/TestFile.txt");
    	    File destinationfile =new File("/Users/venky/Documents/CopyFile1.txt");
    		InputStream input = null;
        	OutputStream output = null;
        	
        	/* FileInputStream to read streams */
    	    input = new FileInputStream(sourcefile);
    	    
    	    /* FileOutputStream to write streams */
    	    output = new FileOutputStream(destinationfile); 
 
    	    byte[] buffer = new byte[1024];
 
    	    int byteread;
    	    while ((byteread = input.read(buffer)) > 0){
    	    	output.write(buffer, 0, byteread);
    	    }
 
    	    if (input != null)input.close();
    	    if (output != null)output.close();
 
    	    System.out.println("File Copied..");
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}