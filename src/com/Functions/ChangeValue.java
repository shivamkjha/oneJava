package com.Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        //primitives - passing values of the reference variable ie a = b ,num = b
        //obj and ref - passing values of the copy of reference variables i.e. a = b = num
        //create an array

        int[] arr = {2,3,55,76};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] =95;            //if you make change to the array via the ref variable, same object will be changed.
    }

}
