package com.OOPS.Lec6.Exceptions;

public class Main {
    public static void main(String[] args) {

        //1.try and catch
        //2. finally
        //3. throw and throws :)

        int a = 5;
        int b = 0;

        try {
            divide(a,b);
//            int c = a/b;
            //throw new Exception("Just for fun");        //it will first go for Arithmetic check then for Exception check and Exception includes all possible exception

        }catch (ArithmeticException e){   //Exception -> RuntimeException -> Arithmetic Exception and as we know we can access Object e of ArithmeticException Class through any one of above parent class
                System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal exception");
        }finally{
            System.out.println("this will always execute :)");
        }
    }

    static int divide(int a ,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Pls do not enter b = 0");
        }
        return a/b;
    }

}
