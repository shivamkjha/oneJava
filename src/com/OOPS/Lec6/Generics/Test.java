package com.OOPS.Lec6.Generics;

public class Test<T>{

//    public static<P> void Arraymax(P[] arr){
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }

    public static<P> void Arraymax(P[] arr){
        P max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if((int)max < (int)arr[i]){
                max = arr[i];
            }
        }
        //return max;

    }


}


