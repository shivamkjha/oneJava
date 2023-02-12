package com.OOPS.Lec6.Generics;

import java.util.Arrays;

public class CustomGenericArrList <T extends Number>{
//here t should either be number or its sub classes
    private static int DEFAULT_SIZE = 10;
    private Object data[];
    private int size = 0;   // working as an index value

    public CustomGenericArrList() {
        //whenever calling the custom arraylist its making an array for you of size DEFAULT_SIZE;
        this.data = new Object[DEFAULT_SIZE];
    }

    //To add a new number to arraylist
    public void add(T num){
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
        Object temp[] = new Object[DEFAULT_SIZE*2];
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T index(int index){
        return (T)(data[index]);
    }

    public void remove(){
        size--;
        //decrease the size by 1

    }

    public int size(){
        return size+1;      //starting from zero size = size + 1
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{"+"data="+Arrays.toString(data)+", size="+size+"}";
    }

    public static void main(String[] args) {
        CustomGenericArrList<Integer> list = new CustomGenericArrList();
        for(int i = 0;i<15;i++){
            list.add(2*i);

        }
        System.out.println(list);


    }
}
