package Reflection;

public class Dog {
    final private String name;
    final private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void testPublicMethod(){
        System.out.println("Public method from dog call has been invoked");
    }
    private void testPrivateMethod(){
        System.out.println("Private method from dog call has been invoked");
    }
}
