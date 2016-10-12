package com.Assignment6OOPS;

public class TestShapes {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,4);
		Circle c=new Circle(4);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		System.out.println(c.pi);
	
	System.out.println("Perimeter:" + r.perimeter());
		System.out.println("Area:" + r.area());
		
		r.setNoOfSide(4);
		System.out.println(r.noOfSides);
		

	}

}
