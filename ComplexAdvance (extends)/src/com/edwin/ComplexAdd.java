package com.edwin;

public class ComplexAdd extends ComplexBase{//extends complexbase so this class will be complexBse type
	double realA,imaginaryA;
	ComplexAdd(){
		realA=0;
		imaginaryA=0;
	}
	ComplexAdd(double a, double b, double c, double d){
		super(a,b,c,d);//assign value to super class
		realA=a+c;
		imaginaryA=b+d;
	}
	public String toString (){
		return "Complex numbers Addition:\t<"+getReal1()+", "+getImaginary1()+"> + <"+
				getReal2()+", " +getImaginary2()+"> = <"+Math.round(realA*10)/10.0+", "+Math.round(imaginaryA*10)/10.0+">";
	}
}
