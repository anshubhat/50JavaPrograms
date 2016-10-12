/*d. Write a program to reverse each individual word in a sentence.*/
package com.String;

public class ReverseEachWord {

public static void reverseString(){
	String str="Anshu Bhat";
	System.out.println("String:" + str);
	String[] words=str.split(" ");
	String reverseString="";
	 
	for (int i=0; i<words.length; i++){
		String word=words[i];
		String reverseWord="";
		for (int j = word.length() - 1; j >= 0; j--){
			reverseWord=reverseWord + word.charAt(j);
		}
		reverseString=reverseString + reverseWord + " ";
	 }
	
	System.out.println("Reverse String:" + reverseString);
	 
}
 public static void main(String[] args) {
	 ReverseEachWord.reverseString();
}

}
