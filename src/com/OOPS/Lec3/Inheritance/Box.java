package com.OOPS.Lec3.Inheritance;

public class Box {
    private int len;
    int wid;
    int hei;

    Box(){
        this.len = -1;
        this.wid = -1;
        this.hei = -1;
    }

// for cube
    Box(int side){
        this.len = side;
        this.wid = side;
        this.hei = side;
    }

    Box(int l,int w, int h){
        this.len = l;
        this.wid = w;
        this.hei = h;
    }
//    Copy constructor : takes the data from another object/instance
    Box(Box oldBox){
        this.len = oldBox.len;
        this.wid = oldBox.wid;
        this.hei = oldBox.hei;
    }

    public void display(){
        System.out.println();
        System.out.println(this.len+" "+this.wid+" "+this.hei);
    }


}
