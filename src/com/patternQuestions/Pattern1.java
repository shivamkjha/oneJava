package com.patternQuestions;

import java.util.Scanner;

public class Pattern1 {
    //Not asked in interviews but great for logic building
    /* STEPS:-
       1.Check no of rows and outer loop will run for that many times only.
       2.Identify for each row how many times the loop has to run.
       3.what do you need to print.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            for(int j = 0;j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
