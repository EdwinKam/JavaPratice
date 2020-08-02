package com.edwin;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
        //map is for u to design the display of ::println
    public static void main(String[] args) {
	// write your code here
        Invoice a = new Invoice(83,"Electric sander",7, 57.98);
        Invoice b = new Invoice(24,"Power saw",18,99.99);
        Invoice c = new Invoice(7,"Sledge hammer", 11,21.50);
        Invoice d = new Invoice(77,"Hammer", 76,11.99);
        Invoice e = new Invoice(39, "Lawn mover",3,79.50);
        Invoice f = new Invoice(68,"Screwdriver",106,6.99);
        Invoice g = new Invoice(56,"Jig saw",21,11.00);
        Invoice h = new Invoice(3,"Wrench",34,7.5);

        Invoice[] array = new Invoice[]{a,b,c,d,e,f,g,h};

        System.out.println("sorted by part description");
        Arrays.stream(array)
                .sorted(Comparator.comparing(Invoice::getPartDescription))//sort by part description
                .forEach(System.out::println);

        System.out.println("\nsorted by part price");
        Arrays.stream(array)
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(System.out::println);

        System.out.println("\nmapped by part description and quantity");
        Arrays.stream(array)
                .sorted(Comparator.comparing(Invoice::getQuantity))//need to sorted first
                .map(str->{return String.format("%-30s%s",str.displayPartDes(),str.displayQua());})//similar way to do it below
        //look care for the formal
        //needed two ;;
                // { is before return
                .forEach(System.out::println);//continue here print

        System.out.println("\nInvoices mapped to description and invoice amount");
        Arrays.stream(array)
            .sorted(Comparator.comparingDouble( x1-> x1.getQuantity()*x1.getPricePerItem()))
                .map(str -> String.format("%-30sInvoice amount: $ %7.2f",
                        str.displayPartDes(),str.getQuantity()*str.getPricePerItem()))
                .forEach(System.out::println);

        System.out.println("\nInvoices mapped to description and invoice amount, range 200-500");
        Arrays.stream(array)
                .sorted(Comparator.comparingDouble( x1-> x1.getQuantity()*x1.getPricePerItem()))
                .filter(x1-> x1.getQuantity()*x1.getPricePerItem()>=200)
                .filter(x1-> x1.getQuantity()*x1.getPricePerItem()<=500)
                .map(str -> String.format("%-30sInvoice amount: $ %7.2f",
                        str.displayPartDes(),str.getQuantity()*str.getPricePerItem()))
                .forEach(System.out::println);



    }
}
