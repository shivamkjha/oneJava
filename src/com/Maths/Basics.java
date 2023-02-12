package com.Maths;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(isOdd(n));

        int arr[] = {1,2,3,4,3,2,1};
        System.out.println(findUnique(arr));


    }

    static boolean isOdd(int n){        // 1 & 1 returns true :)
        if(((n&1)==1)){
            return true;
        };
        return false;
    }

    static int findUnique(int arr[]){
        int unique = 0;

        for(int n: arr){        // 0^ arr[0]^ arr[1]^ arr[2]...^ arr[n]
            unique ^= n;        // 0^ a = a;
        }
        return unique;
    }


}
