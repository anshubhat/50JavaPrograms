package com.Assignment6OOPS;

import java.awt.geom.Arc2D.Double;

public class Circle extends Shapes implements ShapeConstants {
	double radius;

	public Circle (int radius){
		this.radius=radius;
	}
	@Override

	public double area() {
		
		return pi*radius*radius;

	}

	@Override
	public double perimeter() {
		return 2*pi*radius;

	}
	
	public int setNsetNoOfSide(){
		return 0;
	}

}
