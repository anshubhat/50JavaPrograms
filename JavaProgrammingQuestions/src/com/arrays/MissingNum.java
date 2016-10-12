/*b. Write a program to find the missing number in a series of sorted numbers stored in an array.*/
package com.arrays;
public class MissingNum
{
	public static void missNum(int arr[]){
		
		int sum=0;
		int expectecSum;
		int missingNum;
		int n=arr.length;
		
		for (int i=0; i<arr.length; i++){
			sum=arr[i]+sum;
		}
		System.out.println("Sum of given array" + sum);
		expectecSum=(n+1)*(n+2)/2;
		missingNum=expectecSum-sum;
		System.out.println("Missing Number" + missingNum);
		
	}
	
	public static void main(String[] args) {
		MissingNum missobj=new MissingNum();
		int arr[]={1,3,4,5};
		missobj.missNum(arr);
		
	}

}

    
