package com.IfelseConditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//
//        while (true) {
//            int day = in.nextInt();
//
//
//            switch (day) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("Enter the valid no! ie. 1 to 7: ");
//                    break;
//            }
//
//        }
        int day = in.nextInt();

        //OLD SWITCH CASE STATEMENT
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;

        //ENHANCED SWITCH CASE STATEMENT - Point on switch press option+return
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }

    }
}
