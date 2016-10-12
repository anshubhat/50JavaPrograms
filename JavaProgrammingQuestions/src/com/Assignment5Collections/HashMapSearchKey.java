/*d. Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.*/

package com.Assignment5Collections;

import java.util.HashMap;

public class HashMapSearchKey {
	
	public void HashMapSearch(){
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 hmap.put(1, "Foster");
		 hmap.put(6, "John");
		 hmap.put(3, "Gary");
		 hmap.put(4, "Mary");
		 
	String keysearch=hmap.get(6);
	//	System.out.println("Value is ::" + keysearch);
		
		String l="";
		if (hmap.containsKey(l)){
			l=hmap.get(hmap);
		}
		System.out.println(keysearch);
	}
	

	public static void main(String[] args) {
		HashMapSearchKey h=new HashMapSearchKey();
		h.HashMapSearch();
		

	}

}
