package com.OOPS.Lec4.AccessModifier.HomePackage;

public class MySubclass extends MyClass{

    int m5 = d;
    int m4 = b;
    int m3 = c;

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        //m1.a; private not accepted even if you're trying to access it through object of its own class
        int m2 = m1.b;
        int m3 = m1.c;
        int m4 = m1.d;

        //so except private all could be accessed in the subclass :|
    }

}
