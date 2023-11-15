package Polymorphism;

public class MethodOverloading {
    public static void main(String args[]){
        int intSum = Calculator.add(1,2);
        double doubleSum = Calculator.add(1.1,1.2);
        System.out.println("Integer Sum: " + intSum);
        System.out.println("Double Sum: " + doubleSum);
    }
}

class Calculator{
    static int add(int a, int b){
        int sum = a + b;
        System.out.println("Integer from sub class: " + sum);
        return sum + 1;
    }

    static double add(double a, double b){
        double sum = a + b;
        System.out.println("Double from sub class: " + sum);
        return sum + 1.1;
    }
}