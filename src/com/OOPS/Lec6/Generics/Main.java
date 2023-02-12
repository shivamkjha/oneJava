package com.OOPS.Lec6.Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Integer[] arr = {1,2,3,4,5};

        Float arr2[] = new Float[5];
        for(int i = 0;i<5;i++){
            arr2[i] = in.nextFloat();
        }


        Test t1 = new Test<>();
        //t1.Array(arr2);
       // System.out.println(t1.Arraymax(arr2));
    }
}
