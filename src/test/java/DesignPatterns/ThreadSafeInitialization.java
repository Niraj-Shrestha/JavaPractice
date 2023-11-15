package DesignPatterns;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;

    private ThreadSafeInitialization(){}

    public static synchronized ThreadSafeInitialization getInstance() {
        if(instance == null){
            synchronized (ThreadSafeInitialization.class){
                if(instance == null){
                    instance = new ThreadSafeInitialization();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("This is thread safe initialization");
    }

    public static void main(String[] args) {
        ThreadSafeInitialization.getInstance();
        instance.doSomething();
    }
}
