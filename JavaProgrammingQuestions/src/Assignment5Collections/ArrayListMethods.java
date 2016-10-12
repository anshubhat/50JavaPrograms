package Assignment5Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethods {
	
	public void arrls(){
		List<String> arrobj=new ArrayList<String>();
		arrobj.add("Hello");
		arrobj.add("World");
		
		for(String str:arrobj){
			System.out.println("Array List ::" + str);
		}
				
	}
	
	public void searchElement(String key){
		List<String> arrobj=new ArrayList<String>();
		arrobj.add("Hello");
		arrobj.add("World");
		
		
		for (int i=0; i<=arrobj.size(); i++){
			if(arrobj.get(i)==key){
				System.out.println("search yes" + arrobj);
			}
		
		}
		System.out.println("no");
	}
	
	public void IteratorArr(){
		List<String> arrobj=new ArrayList<String>();
		arrobj.add("Hello");
		arrobj.add("World");
		Iterator<String> itobj=arrobj.iterator();
	
		while(itobj.hasNext()){
			String element=itobj.next();
			System.out.println(element + " ");
			
		}
	}
		
		public void ReverseOrderList(){
			List<String> arrobj=new ArrayList<String>();
			arrobj.add("Hello");
			arrobj.add("World");
			ListIterator<String> robj=arrobj.listIterator(arrobj.size());
			
			while(robj.hasPrevious()){
				String element=robj.previous();
				System.out.println("Reverse order using ListIterator::" + element);
				
			}
			
	}
public static void main(String[] args){
	ArrayListMethods a=new ArrayListMethods();
	//a.arrls();

//	a.searchElement("Hello");
//a.IteratorArr();
	a.ReverseOrderList();
}
}
