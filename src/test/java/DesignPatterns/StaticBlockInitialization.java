package DesignPatterns;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance = new StaticBlockInitialization();
    private StaticBlockInitialization(){}

    static {
        try {
            instance = new StaticBlockInitialization();
        }catch (Exception e){
            throw new RuntimeException("Something went wrong");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("This is static block initialization");
    }

    public static void main(String[] args) {
        instance.doSomething();
    }
}

