package DesignPatterns;

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class Helper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Helper.instance;
    }

    public void doSomething(){
        System.out.println("This is bill pugh singleton");
    }

    public static void main(String[] args) {
        Helper.instance.doSomething();
    }
}
