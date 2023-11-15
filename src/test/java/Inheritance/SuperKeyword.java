package Inheritance;

public class SuperKeyword{
    public static void main(String args[]){
        Subclass subclass = new Subclass("Hi! How are you?");
        subclass.doSomething();
        //After initialization of child class all the constructors will be invoked
        Child child = new Child();
    }
}

class Father{
    Father(){
        System.out.println("Calling father constructor from child using super()");
    }
}

class Child extends Father{
    Child(){
        super();
        System.out.println("This is constructor from Child class");
    }
}