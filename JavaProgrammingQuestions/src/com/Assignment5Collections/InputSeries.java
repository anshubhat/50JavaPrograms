//c. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.

package com.Assignment5Collections;


import java.util.Arrays;
import java.util.List;

public class InputSeries {
	
	public static void main(String[] args) {
		String[] a={"a1", "a2", "a3", "a4"};
		String[] b={"b1", "b2", "b3", "b4"};
		
		List<String> list1=Arrays.asList(a);
		List<String> list2=Arrays.asList(b);
		
		int s=list1.size();
		for (int i=0; i<s; i++){
			if (i>0){
			System.out.print(",");
		}
      System.out.print(list1.get(i));
      System.out.print(",");
      System.out.print(list2.get(i));
	}

}
}
