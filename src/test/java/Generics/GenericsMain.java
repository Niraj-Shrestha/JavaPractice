package Generics;

public class GenericsMain {
    public static void main(String[] args) {
        Printer<String> p = new Printer("Test Var");

        p.print();
    }
}
