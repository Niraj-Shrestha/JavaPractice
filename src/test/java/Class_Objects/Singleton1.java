package Class_Objects;

public class Singleton1 {
    private static Singleton1 instance;

    public String str;

    private Singleton1() {
        str = "Hello I am a singleton! Let me say hello world to you";
    }

    public static Singleton1 getSingleInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.getSingleInstance();
        singleton.str = "Hello, World!";
        System.out.println(singleton.str);
    }
}
