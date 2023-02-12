package com.Practice.OOPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Male H1 = new Male(in);
        H1.display();

        Human H2 = new Male(H1);
        H1.display();

        try{
            throw new Excep("This is random exception :)");
        }catch (Excep e){
            System.out.println(e.getMessage());
        }

    }
}
