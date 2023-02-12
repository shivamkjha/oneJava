package com.OOPS.Lec2;

public class A {
    static class B {             //here static class test is inner class hence it will not depend on the object the class "InnerClass" but it can have its own object
        String name;

        public B(String name) {
            this.name = name;
        }
    }
}
