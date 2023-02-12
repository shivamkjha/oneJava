package com.Functions;

public class Scoping {
    public static void main(String[] args) {

        //values that are initialized in the block(or function) will remain in the block and can't be accessed from outside.
        //value already initialized outside the box in the same method you cannot initalize again but you can change it .
         int a = 10;

        {
            //int a = 50  //already initialized value can't be reinitialized.
            a = 50; //already initiated value can be changed.
            int b = 20;
        }
        System.out.println("The value of a is: "+a);
        //System.out.println(b);  // cannot be used outside the block.
        int b = 10;
        System.out.println(b);//can be reinitialised


        int i = 0;
        while(i<3){
            a = 60;                     //could be accessed;
            int c = 88;
            System.out.println(a);
            i++;
        }
        System.out.println(a);
        //System.out.println(c);        //won't work


    }
    static  void random(){
        // a = 70;  //need to initialize this coz outside main function

    }



}
