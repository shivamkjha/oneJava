package com.patternQuestions;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<2*n;i++){
            int col;
            if(i>n){
                col = 2*n-i;
            }else{
                col = i;
            }
            int spc = n-col;
            for(int j = 0;j<spc;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
