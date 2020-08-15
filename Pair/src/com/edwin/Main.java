package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pair<Integer,String,String> n1= new Pair(1,"one","numberPair1");
        Pair<Integer,String,String> n2= new Pair(1,"two","numberPair2");
        Pair<Integer,String,String> n3= new Pair(1,"one","numberPair3");
        Pair<String,String,String> n4= new Pair("ABC","one","numberPair1");
        Pair<String,String,String> n5= new Pair("DEF","two","numberPair2");
        Pair<String,String,String> n6= new Pair("ABC","one","numberPair3");
        System.out.println();
        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));
        System.out.println(n1.equals(n1));
        System.out.println(n4.equals(n5));
        System.out.println(n4.equals(n6));
        System.out.println(n4.equals(n4));
    }
}
