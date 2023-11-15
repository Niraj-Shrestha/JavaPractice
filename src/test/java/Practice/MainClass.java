package Practice;

public class MainClass {
    public static void main(String[] args) {
        ClassA aInstance = new ClassA();
        aInstance.methodA(); // Calls methodA of class A, which in turn calls methodC of class C through class B.
        }
}
