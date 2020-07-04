package com.edwin;

public class ComplexBase {
	double real1,real2,imaginary1,imaginary2;
	ComplexBase(double rl1,double im1,double rl2,double im2){
		real1=rl1;
		real2=rl2;
		imaginary1=im1;
		imaginary2=im2;

	}
	ComplexBase(){
		real1 =0;
		real2=0;
		imaginary1=0;
		imaginary2=0;
	}
	public double getReal1(){
		return real1;
	}
	public double getReal2(){
		return real2;
	}
	public double getImaginary1(){
		return imaginary1;
	}
	public double getImaginary2(){
		return imaginary2;
	}
}
