package Generics;

public class Printer <T> {

    T variable;

    Printer(T variable){
        this.variable = variable;
    }

    void print(){
        System.out.println(variable);
    }
}
