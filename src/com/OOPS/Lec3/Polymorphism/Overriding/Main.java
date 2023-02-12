package com.OOPS.Lec3.Polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        //when child and parent class both have the same name of method then the child class override the parent class in priority.
        //.and this is called Method overriding

        Shapes shapes = new Shapes();
        shapes.Area();
        Shapes.greeting();

        Circle circle = new Circle();
        circle.Area();

        Square square = new Square();   //the priority would be the "Area" function of Square class, if not found then check the parent class "Shape" for the area function
        square.Area();
        //square.greeting() : static variables/methods should be called with the name of ref. class
        Square.greeting();
        //here we're calling Square->greeting() hence : Square's area will be called.


        Shapes square2 = new Square();
        //FOR NONSTATIC METHODS
        square2.Area();
        //for square2 to access the "area" method , "area" method should be in the reference class type i.e. Shapes
        //but which "area" to choose will be decided by the class type i.e. Square();
        //that means the square2.Area() will call the area function from Shapes but area from Square (child class) will override it.

        //FOR STATIC METHOD
        Shapes.greeting();
        //(but oppositely in case of static method,as static doesn't depend on object hence called by class name)
        //Shapes will call the greeting function from Shapes only.


        //CONCLUSION:
        //As nonstatic method depends on object -> object's method will override it
        //but the static method doesn't depend on object -> hence the ref. class's method will be called.
        //.and the obj method can't override it.
    }
}
