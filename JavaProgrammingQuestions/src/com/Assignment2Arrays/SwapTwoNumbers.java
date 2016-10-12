/* f. Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
  For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order*/
 
package com.Assignment2Arrays;

public class SwapTwoNumbers {
	
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
