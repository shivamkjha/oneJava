package com.basicQuestions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){
        int i = 1;
        int fac =1;
        while(i<=n){
            fac =fac*i;
            i++;
        }
        return fac;
    }
}
