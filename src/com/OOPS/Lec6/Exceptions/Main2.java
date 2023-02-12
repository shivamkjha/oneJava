package com.OOPS.Lec6.Exceptions;

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }
}

public class Main2{
    public static void main(String[] args) {
        String name = "Shiv ";
        try{
            if(name.equals("shiv")){

            }else{
                throw new MyException("Enter the correct name ");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

}
