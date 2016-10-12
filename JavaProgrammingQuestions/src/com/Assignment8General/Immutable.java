package com.Assignment8General;

public class Immutable {
	
	private int age;
	private String name;
	
	public Immutable(int age, String name){
		this.setAge(age);
		this.name=name;
	}
	
	 public String getname(){
		 return name;
		 
	 }
	 
	 public void setname(String name){
		 this.name = name;
		 
	 }


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
