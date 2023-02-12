package com.basicQuestions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(oddEven(n));

    }
    static String oddEven(int n){
        if(n%2==0){
            return "Even";
        }else {
            return "odd";
        }
    }
}
