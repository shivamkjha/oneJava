package com.Practice.OOPS;

import java.util.Scanner;

public class Human implements Interface1 {

    String name;
    int age;
    float height;

    Human(Scanner in){
        this.name = in.next();
        this.age = in.nextInt();
        this.height = in.nextFloat();
    }

    Human(Human other){
        this.name = other.name;
        this.age = other.age;
        this.height = other.height;
    }

    void display(){
        System.out.println(this.name+"\n"+this.age+"\n"+this.height);
    }

    public void time() {
        System.out.println("Human beings are there since : ");
        System.out.print(ageTillNow);
    }


}

class Male extends Human{
    static String gender = "male";
    Male(Scanner in){
        super(in);
    }

    Male(Male other){
        super(other);
        this.gender = "female";
    }
    void display(){
        super.display();
        System.out.println(gender);
    }
}


class Female extends Human{
    static String gender = "female";
    Female(Scanner in){
        super(in);
    }

    void display(){
        super.display();
        System.out.println(gender);
    }
}


