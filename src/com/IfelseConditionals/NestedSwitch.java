package com.IfelseConditionals;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int EmpID = in.nextInt();
        String Dep = in.next();

        switch (EmpID){
            case 1 -> System.out.println("Shivam");
            case 2 -> System.out.println("Shubham");
            case 3 -> {
                switch (Dep){
                    case "IT" -> System.out.println("It department");
                    case "HR" -> System.out.println("HR department");
                    default -> System.out.println("Pls enter a valid department:");
                }
            }
            default -> System.out.println("Enter valid EmpId:");
        }


    }
}
