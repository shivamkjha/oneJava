package com.OOPS.Lec4.AccessModifier.OtherPackage;

import com.OOPS.Lec4.AccessModifier.HomePackage.MyClass;

public class RandomClass {
    MyClass random = new MyClass();
//    int a = random.a;
//    int b = random.b;
//    int c = random.c;
    int p = random.d;


    //so except public none could be accessed in the same package :(

}
