/*b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
and "ping pong" if number is divisible by both, else print the number*/

package com.Assignment1Loops;

import java.nio.charset.MalformedInputException;

public class PingPong {
	
	
	int i;
	public void pingWord(int i){
		
	if (i%3==0 && i%5==0){
		System.out.println("ping pong");
	}
	else if(i%3==0)
	{
		System.out.println("ping");
	}
	else if (i%5==0)
	
	{
		System.out.println("pong");
	}
	
	else {
		System.out.println("Not divisible by 3 and 5");
	}
	}
	
	public static void main(String[] args){
		PingPong pingobj=new PingPong();
		pingobj.pingWord(10);
	}
}
