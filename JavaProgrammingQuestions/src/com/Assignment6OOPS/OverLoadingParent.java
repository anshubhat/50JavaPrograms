package com.Assignment6OOPS;

public class OverLoadingParent {
	int a,b,c;
	
	public int method1(int a, char c){
		return a;
		
	}
	public int method1(int a, int b){
		
		return a+b;
		
	}
public int method1(int a, int g, int c){
		
		return a+b+c;
		
	}
public double method1(int a, int b, int c, int d){
	
	return a+b+c+d;
	
}

public static void main (String[] args){
	OverLoadingParent overobj=new OverLoadingParent();
	System.out.println(overobj.method1(2, 9));
	System.out.println(overobj.method1(2, 3));
	System.out.println(overobj.method1(2, 6));
	System.out.println(overobj.method1(2, 6,5,1));
}
}
