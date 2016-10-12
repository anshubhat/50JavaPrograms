/*a. Write a program creating an abstract class Shape with properties
 (noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.*/
package com.Assignment6OOPS;

public abstract class Shapes {
	public int length, width;
	public int noOfSides;
	public abstract double area();
	public abstract double perimeter();
	
	public int getNoOfSide(){
		return noOfSides;
	}
   public void setNoOfSide(int noOfSides){
	   this.noOfSides=noOfSides;
	   
   }
}
