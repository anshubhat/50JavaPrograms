package com.loops;

public class CountVowels {
	public static void main(String[] args) {
	
		String str="anEishu bhat";
		int count=0;
		str=str.toLowerCase();
		for (int i=0; i<str.length(); i++){
			if(str.charAt(i)=='a'
					||str.charAt(i)=='e'
					||str.charAt(i)=='i'
					||str.charAt(i)=='o'
					||str.charAt(i)=='u')
			{
				count++;
				
			}
		}
		System.out.println(count);		
		return;
		
		
		
	}

	}	
