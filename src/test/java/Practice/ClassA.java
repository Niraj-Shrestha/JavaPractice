package Practice;

public class ClassA extends ClassB {
    public void methodA() {
        System.out.println("Method of class A");
        //ClassB bInstance = this; // You can use 'this' to refer to the current instance of A, which is also an instance of B
        //bInstance.methodC(); // Access method of class C through B's instance
        super.methodC();
    }
}

