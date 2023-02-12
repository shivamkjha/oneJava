package com.Practice;

import java.util.Arrays;

public class abc {
    public static void main(String[] args) {
        char arr[] = {'G','Y','b','Y','G','G','Y','b','Y','G'};
        int n = arr.length;
        sort(arr,10);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(char[] arr, int n){
        int countg= 0,countb=0,county=0;

        for(int i = 0;i<n;i++){
            if(arr[i] == 'G'){
                countg++;
            }else if(arr[i] =='Y'){
                county++;
            }else{
                countb++;
            }
        }

        int i = 0;
        while(i<countg){
            for(int j = 0;j<n;j++){
                if(arr[j] == 'G'){
                    swap(arr,i,j);
                    i++;
                }
            }
        }

        while(i<countg+countb){
            for(int j = 0;j<n;j++){
                if(arr[j] == 'Y'){
                    swap(arr,i,j);
                    i++;
                }
            }
        }

        while(i<n){
            for(int j = 0;j<n;j++){
                if(arr[j] == 'b'){
                    swap(arr,i,j);
                    i++;
                }
            }
        }

    }


    static void swap(char arr[], int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
