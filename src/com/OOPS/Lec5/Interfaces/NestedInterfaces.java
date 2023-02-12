package com.OOPS.Lec5.Interfaces;

public class NestedInterfaces {
    //Interface inside a class
    public interface Nested{
        boolean isOdd(int num);
    }
}

class A implements NestedInterfaces.Nested{

    @Override
    public boolean isOdd(int num) {
        return (num % 1)==1;
    }
}

class Main2{
    public static void main(String[] args) {
         A obj = new A();
        System.out.println(obj.isOdd(3));

    }
}
