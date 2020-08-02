package com.edwin;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Invoice a = new Invoice(83,"Electric sander",7, 57.98);
        Invoice b = new Invoice(24,"Power saw",18,99.99);
        Invoice c = new Invoice(7,"Sledge hamner", 11,21.50);

        Invoice[] array = new Invoice[]{a,b,c};
        Arrays.stream(array)
                .sorted(Comparator.comparing(Invoice::getPartNumber))
                .forEach(System.out::println);


    }
}
