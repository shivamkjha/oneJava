package com.OOPS.Lec6.Generics.Compare;

public class Student implements Comparable<Student>{
    //Comparable is an Interface
    int roll;
    int marks;

    public Student(int roll,int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        //if diff is = 0; that means Student 1 = Student 2
        //if diff<0 : student 2 > Student1

        return diff;
    }
}
