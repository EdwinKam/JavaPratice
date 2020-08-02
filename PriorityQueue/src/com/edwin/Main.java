package com.edwin;
import java.util.PriorityQueue;
public class Main {

    public static void main(String[] args) {
        {

            double [] numbers = new double[]{9.8,5.4,1.8,3.5,9.9,15.4,35.1,1.1,3.2,9.8,5.4,1.8,3.5,9.9,15.4};

            // display elements in queue
            AscDul ad = new AscDul(numbers);
            DesDul dd = new DesDul(numbers);
            AscNon an = new AscNon(numbers);
            DesNon dn = new DesNon(numbers);
            System.out.println("Ascending order with duplicate:");
            System.out.println(ad);
            System.out.println("Descending order with duplicate:");
            System.out.println(dd);
            System.out.println("Ascending order without duplicate:");
            System.out.println(an);
            System.out.println("Descending order without duplicate:");
            System.out.println(dn);

        } // end class PriorityQueueTest

    }
}

