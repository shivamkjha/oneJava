package com.OOPS.Lec6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human shiv = new Human(18,"Shivam");
        Human twin = new Human(shiv);
        System.out.println(twin.name+" "+twin.age);


        Human twin2 = (Human)shiv.clone();
        System.out.println(twin2.name+" "+twin2.age);
        System.out.println(Arrays.toString(twin2.arr));
        twin2.arr[0] = 20;
        //changing the array for both twin2 and original object :( :
        // shallow copying   as array is an object and while copying twin/twin2 points to same object address.
        // deep copying there will be no impact on the original objects
        System.out.println(Arrays.toString(twin2.arr));
        System.out.println(Arrays.toString(shiv.arr));

        System.out.println(twin2.name);
        twin2.name = "shubh";
        System.out.println(twin2.name);
        System.out.println(shiv.name);


    }
}
