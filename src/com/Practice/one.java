package com.Practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = "abcdef@&%!";
        String str2 = "ghijkl";
        System.out.println(str1);

        System.out.println(str1.length());
        System.out.println(str1.charAt(5));
        System.out.println(str1.compareTo(str2));       // +ve ,-ve or 0 value

        String str3 = "My name is shivam jha";
        System.out.println(str3.indexOf("is")); //returns the index of first occ of is

        String str4 = "Shivam";
        String str5 = "Jha";
        System.out.println(str4+" "+str5);      //concatenation

        System.out.println(str3.contains("is"));
        System.out.println(str4.equals(str4));      //checks the value == checks the reference

        char[] arr1 = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arr1));

        if(str1.contains("@&")){
            System.out.println("yes");
        }

        System.out.println(str1.replace("@","P"));

        String str6 ="";
        System.out.println(str6.isEmpty());

        System.out.println(str3.replaceFirst("a","@"));
        System.out.println(str3.replaceAll("a","@"));

        String str7 = " Triangle ";
        System.out.println(str7.trim());

        char[] arr2 = str7.trim().toCharArray();
        System.out.println(Arrays.toString(arr2));

        str7 = str7 + "a";
        System.out.println(str7);

        StringBuilder b = new StringBuilder();
        b.append("Hello");
        b.append("Shivam");
        System.out.println(b);
        b.insert(5," ");
        System.out.println(b);
        b.append(" nothing");
        System.out.println(b);
        b.delete(13,20);
        System.out.println(b);
        //b.reverse()
//        for(int i = 0;i<b.length();i++){
//            System.out.println(b.charAt(i));
//        }








    }
}
