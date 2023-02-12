package com.OOPS.Lec6.Generics.Compare;

import java.util.Arrays;

public class Comparision{

    public static void main(String[] args) {
        Student shiv = new Student(1,86);
        Student shubh  = new Student(2,85);
        Student raghu  = new Student(3,91);


        Student list[] = {shiv,shubh,raghu};    // Array of objects

        if(shiv.compareTo(shubh)>0){
            System.out.println("Shiv has got more marks");
        }
    }


}
