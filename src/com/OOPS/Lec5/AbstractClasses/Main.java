package com.OOPS.Lec5.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(33);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(27);
        daughter.career();

        //we can access the above 2 lines through the below two lines as well
        Parent daughter2 = new Daughter(27);
        daughter2.career();

        //Parent mom = new Parent();  : can't create object of abstract class.
        Parent.greeting();

    }
}
