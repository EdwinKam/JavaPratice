package com.edwin;

public class ComplexDiv extends ComplexBase{
	double realA,imaginaryA;
	ComplexDiv(){
		realA=1.2232;
		imaginaryA=1.2232;
	}
	ComplexDiv(double a, double b, double c, double d){
		super(a,b,c,d);//assign value to super class
		realA=a*c+b*d;
		if (c==0&&d==0){
			realA=1.2232;
			imaginaryA=1.2232;
		}
		else
		imaginaryA=(b*c-a*d)/(c*c+d*d);
	}
	public String toString (){
		if (realA==1.2232&&imaginaryA==1.2232){
			return "Complex numbers Division: \t<"+getReal1()+", "+getImaginary1()+"> / <"+
			getReal2()+", " +getImaginary2()+"> = infinite.";
		}
		return "Complex numbers Division: \t<"+getReal1()+", "+getImaginary1()+"> / <"+
				getReal2()+", " +getImaginary2()+"> = <"+Math.round(realA*10)/10.0+", "+Math.round(imaginaryA*10)/10.0+">";
	}
}
