package com.basicQuestions;

import java.util.Scanner;

public class primeAlt {
    //Check the number is prime or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int c = 2;

        while(n>c){
            if(n%c ==0){
                System.out.println("no prime");
            }
            c++;
        }
        System.out.println("prime");

    }

}