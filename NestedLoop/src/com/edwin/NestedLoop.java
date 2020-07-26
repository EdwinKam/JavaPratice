package com.edwin;

public class NestedLoop {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i< 5; i++){
            System.out.println("lets do some loop");

        }
        String[] array = {"red","yellow","green"};
        for(int i =0; i < 3; i++){
            //System.out.println(array[i]);
        }
        String [][] fancycolor= {{"red","blue", "green" },
                                {"cyan","mageta","fsf"}};
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
            System.out.println(fancycolor[i][j]);
        }}

        for (int i = 0; i<3000000; i++){

                System.out.println(i);
            }




    }
}
