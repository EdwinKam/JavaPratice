package com.edwin;

import javax.xml.xpath.XPathEvaluationResult;
import java.util.Arrays;

public class Main {
    //public static int left =0,right =array.length;
    public static void main(String[] args) {
	// write your code here
        QuickSort q1 = new QuickSort("array1");
        q1.sort(0,q1.getSize()-1);//mine
        System.out.println("sort method called.");
        System.out.println(q1);
        Arrays.sort(q1.getArr());//lib
        System.out.println(q1);

        QuickSort q2 = new QuickSort("array2");
        q2.sort(0,q2.getSize()-1);
        System.out.println("sort method called.");
        System.out.println(q2);
        Arrays.sort(q2.getArr());
        System.out.println(q2);

        QuickSort q3 = new QuickSort("array3");
        q3.sort(0,q3.getSize()-1);
        System.out.println("sort method called.");
        System.out.println(q3);
        Arrays.sort(q3.getArr());
        System.out.println(q3);

        QuickSort q4 = new QuickSort("array4");
        q4.sort(0,q4.getSize()-1);
        System.out.println("sort method called.");
        System.out.println(q4);
        Arrays.sort(q4.getArr());
        System.out.println(q4);

    }


}
