package DesignPatterns;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("This is Enum singleton");
    }
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}
