
package com.edwin;

public class Staticky {
    int a = 8;
    public static void main(String[] args) {
	// write your code here
        Staticky st = new Staticky();//must need to create an object first if no static declared
        System.out.println(st.a);
    }
}
