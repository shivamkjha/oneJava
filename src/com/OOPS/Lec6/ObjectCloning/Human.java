package com.OOPS.Lec6.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{5,2,5,1,9};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    //OR WE CAN USE ...
    //to use clone() must implement cloneable
    //if we don't implement Cloneable then it'll throw an exception


//    THIS IS SHALLOW COPY
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }

//    THIS IS DEEP COPY
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();  //this is shallow copy
        twin.name = new String(twin.name);
        twin.arr = new int[twin.arr.length];
        for(int i = 0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
