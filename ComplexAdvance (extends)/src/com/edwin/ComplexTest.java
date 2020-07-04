package com.edwin;

import java.awt.*;

public class ComplexTest {

    public static void main(String[] args) {
	// write your code here
        ComplexBase [] Complex = new ComplexBase [14];
        //int i=0;
        Complex[0] = new ComplexAdd(9.5,7.7,1.2,3.1);
        Complex[1] = new ComplexSub(9.5,7.7,1.2,3.1);
        Complex[2] = new ComplexMul(9.5,7.7,1.2,3.1);
        Complex[3] = new ComplexDiv(9.5,7.7,1.2,3.1);
        Complex[4] = new ComplexAdd(-6.3,5.2,3.4,-2.8);
        Complex[5] = new ComplexSub(-6.3,5.2,3.4,-2.8);
        Complex[6] = new ComplexMul(-6.3,5.2,3.4,-2.8);
        Complex[7] = new ComplexDiv(-6.3,5.2,3.4,-2.8);
        Complex[8] = new ComplexDiv(-6.3,5.2,0,0);
        Complex[9] = new ComplexAdd();
        Complex[10] = new ComplexSub();
        Complex[11] = new ComplexMul();
        Complex[12] = new ComplexDiv();
        Complex[13] = new ComplexDiv(0,0,0,0.1);

        for(ComplexBase current: Complex)
        System.out.println(current);
    }
}
