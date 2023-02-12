package com.OOPS.Lec2;

class Human{
    int age;
    String Name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello world");
        //System.out.println(this.age);
        // : we can't use this as static methods doesn't depend on the obj how can it access it
    }

    Human(int age, String Name, int salary,boolean married){
        this.age = age;
        this.Name = Name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;

    }
}
public class Static {
    public static void main(String[] args) {
        Human h1 = new Human(17,"shiv",100000,true);
        Human h2 = new Human(18,"shubh",100000,false);

        System.out.println("Static variables are obj independent: ");
        System.out.println(Human.population);
        //we can access the static method with the object name but standard convention is to do it with the class name

    }
}
