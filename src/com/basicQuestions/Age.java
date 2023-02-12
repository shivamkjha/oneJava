package com.basicQuestions;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(check(a));

    }

    static String check(int a){
        if (a>18){
            return "Eligible";
        }else{
            return"not eligible";
        }
    }
}
