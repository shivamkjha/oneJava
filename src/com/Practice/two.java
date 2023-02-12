package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[n][p];
        int[][] arr3 = new int[m][p];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<p;j++){
                arr3[i][j] = 0;
                for(int k = 0;k<n;k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }



        for( int[] array: arr1){
            System.out.println(Arrays.toString(array));
        }


    }
}
