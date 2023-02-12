package com.IfelseConditionals;

public class Q_CheckReoccur {
    public static void main(String[] args) {
        int n = 1385757879;
        //System.out.println(n);
        int count = 0;

        while (n>0){
            if (n%10==7){
                count++;
            }
            n= n/10;
        }

        System.out.println(count);
    }
}
