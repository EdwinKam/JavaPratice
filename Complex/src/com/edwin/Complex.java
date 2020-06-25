package com.edwin;

public class Complex {
	double real;
	double imaginary;

	Complex(){
		real= 0;
		imaginary =0;
	}
	Complex(double rl, double im) {
		real = rl;
		imaginary=im;
	}
	Complex add(Complex o){//function type is the class name
		Complex n = new Complex();
		n.real= o.real+this.real;
		n.imaginary=o.imaginary+this.imaginary;
		return n;
	}
	Complex subtract(Complex o){
		Complex n = new Complex();
		n.real= this.real-o.real;
		n.imaginary=this.imaginary-o.imaginary;
		return n;
	}
	Complex multiply (Complex o){
		Complex n = new Complex();
		n.real=this.real*o.real-this.imaginary*o.imaginary;
		//System.out.println(o.imaginary);
		n.imaginary=(this.real*o.imaginary)+(this.imaginary*o.real);

		return n;

	}
	Complex division (Complex o){
		Complex n = new Complex();
		n.real=this.real*o.real+this.imaginary*o.imaginary;
		n.imaginary=(this.imaginary*o.real-this.real*o.imaginary)/(o.real*o.real+o.imaginary*o.imaginary);
		return n;
	}
	public String toString (){
		return "<"+Math.round(real*10)/10.0+", "+Math.round(imaginary*10)/10.0+">";
	}


}




