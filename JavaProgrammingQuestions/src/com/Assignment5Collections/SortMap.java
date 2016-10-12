//e. Write a program to sort a map by value.
package com.Assignment5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//e. Write a program to sort a map by value.
public class SortMap {
	
	public void HashSortMap(){
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 hmap.put(1, "Foster");
		 hmap.put(4, "John");
		 hmap.put(6, "Gary");
		 hmap.put(2, "Mary");
		 
		 for (Map.Entry<Integer, String> s:hmap.entrySet()){
			System.out.println(s.getKey() + ":" + s.getValue());
			
		 }
		 
	}	 
		 //Second method
		 public void collectionMap(){
		 List<String> cmap = new ArrayList<String>();
		 cmap.add("Foster");
		 cmap.add("John");
		 cmap.add("Gary");
		 cmap.add("Mary");
		 
		 for (int i=0; i<cmap.size(); i++){
			// System.out.println(cmap.get(i));
		 }
		 
		 Collections.sort(cmap);
		 for (int j=0; j<cmap.size(); j++){
			 System.out.println(cmap.get(j));
		 }
	}
	

	public static void main(String[] args) {
		SortMap sobj=new SortMap();
		sobj.HashSortMap();
		sobj.collectionMap();

	}

}
