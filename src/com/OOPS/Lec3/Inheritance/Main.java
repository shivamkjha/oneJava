package com.OOPS.Lec3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.display();
        Box box2 = new Box(2,3,4);
        box2.display();
        Box box3 = new Box(box2);       //copying the data using copy constructor
        box3.display();

        BoxColor box4 = new BoxColor();
        box4.displayColor("box4");
        BoxColor box5 = new BoxColor("Red");
        box5.displayColor("box5");
        BoxColor box6 = new BoxColor(2,3,4,"Orange");
        box6.displayColor("box6");
        //System.out.println(box6.l); couldn't be accessed (when l is private) hence waste


//        Referencing BoxColor object from Box Class ref.
        Box box7 = new BoxColor(2,34,5,"Red");  // obj is of type BoxColor and ref variable is of Box class
        System.out.println(box7.hei);
        //box7.color : couldn't be accessed as Box class doesn't have anything like "color" variable.
        //When a reference to a subclass object is assigned to a super class ref variable you can only access
        //to those parts of the obj which are defined in the super class only.

//       Reference a child through its parent
        //BoxColor box8 = new Box(2,3,4);
        //"you are given access to the variables which are in the reference type i.e ,BoxColor his time"
        //hence you should have access to "color" variable
        //which you can't through a constructor of the parent or super class, as the parent clas in not aware of the color variable


//  Understanding Super and Multilevel Inheritance:

        BoxPrice box9 = new BoxPrice(1,2,3,"Green",100);
        BoxPrice box10 = new BoxPrice(box9);
        box10.display();
        box10.displayColor("box10");
        box10.displayPrice("bname");
    }
}
