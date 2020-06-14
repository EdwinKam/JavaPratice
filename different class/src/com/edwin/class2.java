/*
 * Edwin Kam Copyright (c) 2020. All right reserved
 */

package com.edwin;


public class class2 {

    enum Flavor {
        CHOCO, VAN, STRAWBERRY
    };

    public static void main(String[] args){
        Flavor van = Flavor.VAN;
        Flavor ch = Flavor. CHOCO;
        Flavor haha= Flavor.STRAWBERRY;
        //System.out.println(l);
        switch(ch){
            case VAN :
                System.out.println("van");
                break;
            case CHOCO:
                System.out.println("cjjco");
                break;

        }
    }
}
