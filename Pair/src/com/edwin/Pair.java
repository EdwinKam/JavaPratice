package com.edwin;

public class Pair <F,S,T >{
	private F one;
	private S two;
	private T three;
	private String name;
	Pair(F first, S second, T third){
		one =first;
		//setOne(first);
		setTwo(second);
		setThree(third);
		name ="\""+getThree()+": < "+getOne()+", "+getTwo()+", "+getThree()+" >\"";
		System.out.println("An object " +name+" is created");
	}
	private void setOne(F one){
		this.one=one;
	}
	private void setTwo(S two){
		this.two=two;
	}
	private void setThree(T three){
		this.three=three;
	}

	public F getOne() {
		return one;
	}

	public S getTwo() {
		return two;
	}

	public T getThree() {
		return three;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Pair object){
		System.out.printf("Is %s equals to %s? ",name,object.getName());
		return(one==object.getOne()&&two==object.getTwo()&&three==object.getThree());

	}
}

