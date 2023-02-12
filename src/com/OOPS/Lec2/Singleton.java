package com.OOPS.Lec2;

public class Singleton {        //can only have one object.
    String name;
    private Singleton(){
        this.name = "Shivam";
        //can't be accessed outside the SingletonClass
    }

    private static Singleton object1;       //declearing an object

    public static Singleton getObject(){
        //get instance or object
         //check whether one obj only is created or not
        if(object1 == null){
            object1 = new Singleton();      //creating an object
        }
        return object1;
        //if created just show the object
    }


}

