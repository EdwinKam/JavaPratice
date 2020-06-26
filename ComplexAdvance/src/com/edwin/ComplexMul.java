package com.edwin;

public class ComplexMul extends ComplexBase {
	double realA,imaginaryA;
	ComplexMul(){
		realA=0;
		imaginaryA=0;
	}
	ComplexMul(double a, double b, double c, double d){
		super(a,b,c,d);//assign value to super class
		realA=a*c-b*d;
		imaginaryA=a*d+b*c;
	}
	public String toString (){
		return "Complex numbers Multiplication: \t<"+getReal1()+", "+getImaginary1()+"> * <"+
				getReal2()+", " +getImaginary2()+"> = <"+Math.round(realA*10)/10.0+", "+Math.round(imaginaryA*10)/10.0+">";
	}
}
