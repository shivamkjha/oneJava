package com.OOPS.Lec1;
import java.util.Scanner;

class Student{
    String name;        //instance variables
    int roll;
    int marks;

    Student(){
        //calling constructor from another constructor
        this("Shiv",5,88);
    }

    //if you say  student shiv = new student("Shiv")
    // then "this" will be replaced with shiv and shiv.name = Shiv...
    Student(String name, int roll,int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    //we can create a default constructor which will put the same value for all objects .
    void display(){
        System.out.println("The details of "+this.name+" is : ");
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.marks);
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("object removed");
    }
}

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student s1 = new Student();
        s1.display();
    }
}
