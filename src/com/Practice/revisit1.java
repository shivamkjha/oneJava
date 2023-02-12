package com.Practice;

public class revisit1 {
    public static void main(String args[]){
        byte by = 127;      //1 byte
        short sh = 32000;   // 2 bytes
        int a = 5;          // 4 bytes
        long l = 23223423;  // 8 bytes

        boolean b = true;
        char c = 'a';       //2 bytes
        float f = 53.53333333333f;  //only 6 precision - 4 bytes
        double d = 32.23456234543234432; // upto 15 precision - 8 bytes

        System.out.println(f+"  "+d);
    }
}
