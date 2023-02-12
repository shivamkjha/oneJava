package com.OOPS.Lec6.Generics;

import java.util.ArrayList;
import java.util.Scanner;


public class CustomArrayList {
    private static int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;   // working as an index value
    public CustomArrayList() {
        //whenever calling the custom arraylist its making an array for you of size DEFAULT_SIZE;
        this.data = new int[DEFAULT_SIZE];
    }


    //To add a new number to arraylist
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]= num;
        //"i++ means 'tell me the value of i, then increment', whereas ++i means 'increment i, then tell me the value'.
    }

    private boolean isFull(){
        return size == DEFAULT_SIZE;
    }

    private void resize(){
        int temp[] = new int[DEFAULT_SIZE*2];
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int index(int index){
        return data[index];
    }

    public void remove(){
        size--;
        //decrease the size by 1

    }

    public int size(){
        return size+1;      //starting from zero size = size + 1
    }



    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i = 0;i<11;i++){
            list.add(i);
        }
        list.index(0);
        System.out.println(list.index(0));
        System.out.println(list.size());
        list.remove();
        System.out.println(list.size());


    }
}
