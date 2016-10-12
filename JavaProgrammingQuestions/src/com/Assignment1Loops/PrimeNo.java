//e.Write a program  to check if a given number is prime or not.
package com.Assignment1Loops;

public class PrimeNo {
	
	public void isPrime(int i){
		if (i%2!=0){
			System.out.println("Prime Number:" + i);
		}
		else {
			System.out.println("Not a Prime Number:" +i);
		}
	}

	public static void main(String[] args) {
		PrimeNo primeobj=new PrimeNo();
		primeobj.isPrime(4);

	}

}
