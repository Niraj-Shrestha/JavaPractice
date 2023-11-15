package DesignPatterns;

public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization(){}

    public static LazyInitialization getInstance() {
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("This is lazy initialization");
    }

    public static void main(String[] args) {
        LazyInitialization.getInstance();
        instance.doSomething();
    }
}
