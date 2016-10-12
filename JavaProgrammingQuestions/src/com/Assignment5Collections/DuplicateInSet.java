//b. Write a program to find duplicates in an array using set.
package com.Assignment5Collections;

import java.util.HashSet;

public class DuplicateInSet {
     
	public void DuplicateArr(){
		int [] arr={1,2,3,3,4,5,6,7,7};
		
		HashSet<Integer> dupset=new HashSet<Integer>();
		
		
		
		for (int i=0; i<=arr.length; i++){
			if(dupset.add(arr[i])==false){
				System.out.println("Dublicate ::" + arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		DuplicateInSet d= new DuplicateInSet();
		d.DuplicateArr();

	}

}
