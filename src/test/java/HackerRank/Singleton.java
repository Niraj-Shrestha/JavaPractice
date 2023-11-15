package HackerRank;

class Singleton{
    private static Singleton instance;

    public String str;

    private Singleton() {
        str = "Hello I am a singleton! Let me say hello world to you";
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = "Hello, Worl d!";
        System.out.println(singleton.str);
    }
}
