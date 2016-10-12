package com.Assignment6OOPS;

public class Rectangle extends Shapes {
  private int width;
private int length;
 
  public Rectangle (int l, int w){
	  this.length=l;
	  this.width=w;
  }
  
	@Override

	public double area() {
		return width*length;

	}

	@Override
	public double perimeter() {
		return 2*(width+length);

	}


}
