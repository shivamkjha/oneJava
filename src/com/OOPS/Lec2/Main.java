package com.OOPS.Lec2;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getObject();
        Singleton obj2 = Singleton.getObject();
        Singleton obj3 = Singleton.getObject();

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);

        // all 3 of them are pointing to the same object which is object1 , i.e created inside the singleton class

    }

}
