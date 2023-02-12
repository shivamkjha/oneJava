package com.OOPS.Lec4.AccessModifier.OtherPackage;

import com.OOPS.Lec4.AccessModifier.HomePackage.MyClass;

public class SubclassInOtherPkg extends MyClass{
    MyClass s1 = new MyClass();
//    int s2 = s1.a;
//    int s3 = s1.b;
//    int s4 = s1.c;
    int s5 = s1.d;

    //so except public none could be accessed in the same package :(
    //BUT...
    //only subclass can access protected members in the subclass of other package

    SubclassInOtherPkg subclass = new SubclassInOtherPkg();
    int d = subclass.c;
    int l = c;      //we can directly assess c coz its in the super class of SubClassInOtherPkg

}
