package com.OOPS.Lec1;


public class Final {
    public static void main(String[] args) {
        final int a = 5;
        //a = 10; : final can't be changed or reassigned for primitives

        final String  s  = "Shiv";
        System.out.println(s);
        //can't change it

        Student s1 = new Student();
        s1.display();       //by default name is "shiv"

        final Student s2 = new Student();
        s2.name = "shubh";      //can change the value
        //s2 = s1;              can't reassign new object
        s2.display();

//        Student obj;
//        for(int i = 0;i<100000000;i++){
//            obj = new Student();
//        }
    }
}
