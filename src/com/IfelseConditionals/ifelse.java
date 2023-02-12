package com.IfelseConditionals;

public class ifelse {
    public static void main(String[] args) {
        int salary = 25000;

        if(salary<2500){
            System.out.println("better luck next time !");
        }else if( salary >70000) {
            System.out.println("Nothing");
        } else {
            System.out.println("you'll get a salary of "+(salary+ 5000));
        }
    }
}
