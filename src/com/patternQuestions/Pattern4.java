package com.patternQuestions;


public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<2*n;i++){
            int col;
            if(i<n){
                col = i;
            }else{
                col = 2*n-i;
            }
            for(int j = 0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
