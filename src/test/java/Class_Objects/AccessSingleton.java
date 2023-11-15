package Class_Objects;

public class AccessSingleton {
    public static void main(String[] args) {
        Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        instance1.accessSingleton();
    }
}
