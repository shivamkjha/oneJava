package com.OOPS.Lec3.Inheritance;

public class BoxWeight extends Box{
    // example of Hierarchical Inheritance
    // as BoxWeight and BoxColor both extends Box;

    int weight;

    BoxWeight(int weight){
        super();
        this.weight = weight;
    }
    public void displayWeight(String bname) {
        System.out.println("properties of "+bname+" is: ");
        super.display();
        System.out.println(this.weight);
    }

    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(56);
        box.displayWeight("box");
    }
}
