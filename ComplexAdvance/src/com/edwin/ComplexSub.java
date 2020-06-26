package com.edwin;

public class ComplexSub extends ComplexBase{
	double realS,imaginaryS;
	ComplexSub(){
		realS=0;
		imaginaryS=0;
	}
	ComplexSub(double a, double b, double c, double d){
		super(a,b,c,d);//assign value to super class
		realS=a-c;
		imaginaryS=b-d;
	}
	public String toString (){
		return "Complex numbers Subtraction:\t<"+getReal1()+", "+getImaginary1()+"> - <"+
				getReal2()+", " +getImaginary2()+"> = <"+Math.round(realS*10)/10.0+", "+Math.round(imaginaryS*10)/10.0+">";
	}
}
