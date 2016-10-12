//c.Write a program to find the common number in any given two arrays.
package com.arrays;

public class CommonNumberTwoArrays {
	
	public static void main(String[] args){
		int arryone[]={4,3,5,9};
		int arrytwo[]={5,2,1,7};
		
		for (int i=0;i<arryone.length; i++){
			for (int j=0; j<arrytwo.length;j++){
				if (arryone[i]==arrytwo[j]){
					System.out.println(arryone[i]);
				}
			}
			
		}
		
		
	}
	

}
