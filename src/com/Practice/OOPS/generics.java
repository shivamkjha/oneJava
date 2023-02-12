package com.Practice.OOPS;

import java.util.Arrays;

public class generics <T extends Comparable<T>>{
    T[] vals;

    generics(T[] other){
        vals = other;
    }

    public T max(){
        T max = vals[0];
        for(int i = 0;i<vals.length;i++){
            if(max.compareTo(vals[i])>0){
                max = vals[i];
            }
        }
        return max;
    }

    public void sort(){
        for(int i = 0;i<vals.length;i++){
            for(int j = 1;j<vals.length-i;j++){
                if(vals[j].compareTo(vals[j-1])<0){
                    T temp = vals[j];
                    vals[j] = vals[j-1];
                    vals[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(vals));
    }

}

class Main3{
    public static void main(String[] args) {
        Integer[] arr = {6,2,3,8,3,9};
        generics<Integer> g = new generics<Integer>(arr);
        g.sort();
    }
}
