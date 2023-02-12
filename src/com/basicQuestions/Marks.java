package com.basicQuestions;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        grade(mark);
    }

    static void grade(int mark) {
        if (91 <= mark && 100 >= mark) {
            System.out.println('A');
        }
        if (81 <= mark && 90 >= mark) {
            System.out.println('B');
        }
        if (71 <= mark && 80 >= mark) {
            System.out.println('C');
        }
        if (61 <= mark && 70 >= mark) {
            System.out.println('D');
        }
        if (51 <= mark && 60 >= mark) {
            System.out.println('E');
        }
        if (41 < mark && 50 > mark) {
            System.out.println('F');
        }
        if (mark <= 40) {
            System.out.println("Fail");
        }
    }
}
