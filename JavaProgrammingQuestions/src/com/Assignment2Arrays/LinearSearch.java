/*d. Write a program to perform a linear search on any given array.Linear search is the basic 
search where you look for the element to be searched in a sequential way.*/
 
package com.Assignment2Arrays;

public class LinearSearch {
	
	public void searchKey (int key){
		int [] arry={4,3,7,8};
		for (int i=0; i<arry.length; i++){
			if (arry[i]==key){
				System.out.println("Value of search:" + arry[i]);
				System.out.println("Position in the index: " + i);
				
			}
			
			}
		
			System.out.println("no");
		}
		
	
	
	public static void main(String[] args) {
		LinearSearch keyobj=new LinearSearch();
		keyobj.searchKey(1);
		
		
	}

}
