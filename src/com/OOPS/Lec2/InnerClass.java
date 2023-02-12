package com.OOPS.Lec2;

import com.OOPS.Lec2.A;

public class InnerClass {
//    static class Test{             //here static class test is inner class hence it will not depend on the object the class "InnerClass" but it can have its own object
//        String name;
//        public Test(String name){
//            this.name = name;
//        }
//    }

//    class Test{             //this will give error as we can't access this from inside static context main()
//        String name;
//        public Test(String name){
//            this.name = name;
//        }
//    }

    public static void main(String[] args) {
        A.B obj1 = new A.B("shiv");         //we've imported the class B
        A.B obj2 = new A.B("shubh");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
