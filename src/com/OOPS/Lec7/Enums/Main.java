package com.OOPS.Lec7.Enums;

public class Main{
    enum Week implements A{          //can't extend any class but can implement interface : (enums extends java.lang.enum class)
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

        //these are enum constants(type is Week) : public static final | since its final no child class of enum
        //enums can't be super class

//        Week(){
//            System.out.println("Constructor called for "+this);
//        }
        //this is not public or protected : only default and private
        //coz we don't want to create new objects
        @Override
        public void say() {
        System.out.println("I'm implementing an interface from enum :) ");
}

    }

    public static void main(String[] args) {
        Week day1 = Week.Monday;

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

        System.out.println(day1);
        System.out.println(day1.ordinal());     //position of enum declaration
        day1.say();
    }
}
