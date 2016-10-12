//e. Write a program to sort an array.
package com.Assignment2Arrays;

public class SortArray {

	public static void main(String[] args) {
		int number[]={5,6,2};
		int swap;
		    for (int i=0; i<number.length-1; i++){
		    	for (int j=0; j<number.length-1-i; j++){
		    		if (number[j]>number[j+1]){
		    			swap=number[j];
		    					
		    			number[j]=number[j+1];
		    					 
		    			number[j+1]=swap;
		    					     
		    		}
		    	}
		    }
		    System.out.println("Sort Array");
           for (int i=0;i<number.length;i++){
        	   System.out.print(number[i] +"\t");
           }
	}

}
