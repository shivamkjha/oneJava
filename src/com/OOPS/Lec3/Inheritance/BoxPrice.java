package com.OOPS.Lec3.Inheritance;

public class BoxPrice extends BoxColor{
    double price;

    BoxPrice(){
        super();    //this is also called by default without writing super();
        this.price = 200;
    }

     BoxPrice(BoxPrice other){
        super(other);               //copying l,w,h,color from the parent classes
        this.price =other.price;    //copying the price
     }

    public BoxPrice(int l, int w, int h, String color, double price) {
        super(l, w, h, color);
        this.price = price;
    }
    public void displayPrice(String bname){
        super.displayColor(bname);
        System.out.println(this.price );
    }
}
