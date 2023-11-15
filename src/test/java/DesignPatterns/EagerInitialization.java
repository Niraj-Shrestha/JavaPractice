package DesignPatterns;

import java.lang.reflect.Constructor;

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();
    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("This is Eager initialization");
    }

    public static void main(String[] args) {
        instance.doSomething();
        LazyInitialization.getInstance().doSomething();
        BillPughSingleton.getInstance().doSomething();
        StaticBlockInitialization.getInstance().doSomething();
        ThreadSafeInitialization.getInstance().doSomething();


    }
}
