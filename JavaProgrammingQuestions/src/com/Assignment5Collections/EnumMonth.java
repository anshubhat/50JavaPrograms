//f. Write a program that defines an enum having months of the year and then prints the value of all the enum elements.

package com.Assignment5Collections;

public class EnumMonth{
	
	public enum month{
		January, Feb, March, April, May, June, July, August, September, October, November, December
	
}


	
	public static void main(String[] args) {
		for (month s : month.values()){
			System.out.println(s);

		}
	}

}
