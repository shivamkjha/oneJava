package com.patternQuestions;

public class Pattern6 {
    public static void main(String[] args){
        int n = 5;
        for(int row = 0;row<n;row++){
            for(int i = 0;i<n-row;i++){
                System.out.print("  ");
            }
            for(int c = row+1; c>=1; c--){
                System.out.print(c+" ");
            }
            for(int j = 1;j<=row;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
