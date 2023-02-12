package com.OOPS.Lec3.Inheritance;

// Child class of Box
public class BoxColor extends Box {
    String color;

    public BoxColor() {
        this.color = "Blue";
        //this.l can't use l as it's private but super can call it and you can even take input for it
    }

    public BoxColor(String color){
        this.color = color;
    }

    public BoxColor(int l, int w, int h, String color) {
        super(l, w, h);     //call the constructor from parent class
        //we can just take the input "l" and display it through the base class constructor but can't access it.
        this.color = color;
    }

    public BoxColor(BoxColor old){
        super(old);     //copying l ,w ,h from the old object
        this.color = old.color;
    }

    public void displayColor(String bname) {
        System.out.println("properties of "+bname+" is: ");
        super.display();
        System.out.println(this.color);
    }

}
