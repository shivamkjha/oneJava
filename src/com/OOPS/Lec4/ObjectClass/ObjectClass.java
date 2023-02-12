package com.OOPS.Lec4.ObjectClass;

public class ObjectClass extends A {
    //every class extends Object class

    int num;
    float gpa;

    //Constructor
    public ObjectClass(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    //unique representation on an object via a random number || not address of the obj.
    //It's  used to check whether 2 objects are same nor not.
    public int hashCode() {
        return this.num;
        //return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        //modifying the equality condition using equals method
        if(this.num == ((ObjectClass)obj).num){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClass object1 = new ObjectClass(24,7.59f);
        System.out.println(object1.hashCode());  //before changing : 1159190947
        
        ObjectClass object2 = new ObjectClass(24,9.1f);
        System.out.println(object2.hashCode()); //before changing : 925858445
        
        if(object1 == object2){
            System.out.println("obj1 and obj2 points to same object");
        }
        
        if(object1.equals(object2)){
            System.out.println("object1.num == object2.num");
        }

        //CHECKS WHETHER OBJECT IS OF A PARTICULAR CLASS (OR A SUPER CLASS) OR NOT
        System.out.println(object1 instanceof ObjectClass);
        System.out.println(object1 instanceof A);
        System.out.println(object1 instanceof Object);

        System.out.println(object1.getClass().getName());




    }
}
