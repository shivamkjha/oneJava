package com.basicQuestions;

public class maxMin {
    public static void main(String[] args) {
        System.out.println("The max is :");
        System.out.println(max(2,3,4));
        System.out.println("The min is: ");
        System.out.println(min(2,3,4));

    }

    static int max(int a ,int b,int c){
        int max =a;
        if(b>max){
            max =b;
        }
        if(c>max){
            max =c;
        }
        return max;
    }

    static int min(int a ,int b,int c){
        int min =a;
        if(b<min){
            min =b;
        }
        if(c<min){
            min =c;
        }
        return min;
    }




}
