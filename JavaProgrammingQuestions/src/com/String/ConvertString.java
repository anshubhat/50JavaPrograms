//c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
package com.String;

public class ConvertString {

	public static void main(String[] args) {
		String str="This is nice";
		System.out.println(str);
		int count=1;
		String[] arr=str.split(" ");
		for(int i=0; i<arr.length; i++){
			String S1=" ";
			arr[i]=arr[i] + count;
			count++;
			System.out.print(S1=arr[i] + " ");
		}

	}

}
