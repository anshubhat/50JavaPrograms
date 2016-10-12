//a. Write a program to find the largest number in a given array.
package com.Assignment2Arrays;

public class LargestArray {
	
	public void largestNumber(){
		int number[]={5,3,1,9,7};
		int largest=number[0];
		for(int i=1; i<number.length; i++){
			if(number[i]>largest){
				largest=number[i];
			}
		
		}
		System.out.println("Largest number in the arrary :" + largest);	
	}

	public void smallestNumber(){
		int number[]={5,9,3,1,7};
		int smallest=number[0];
		for(int i=1; i<number.length; i++){
			if(number[i]<smallest){
				smallest=number[i];
			}
		
		}
		System.out.println("Largest number in the arrary :" + smallest);	
	}
	public static  void main(String[] args){
		LargestArray arryobj=new LargestArray();
		arryobj.largestNumber();
		arryobj.smallestNumber();
	
	}
}

	