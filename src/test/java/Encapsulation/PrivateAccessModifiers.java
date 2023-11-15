package Encapsulation;

public class PrivateAccessModifiers {

    private int privateVal = 1000;

    public static void main(String args[]) {
        AccessPrivateFromHere access = new AccessPrivateFromHere();
        //private methods of access are not visible in this class
        PrivateAccessModifiers accessPrivate = new PrivateAccessModifiers();
        accessPrivate.accessThis();
        accessPrivate.accessThis(accessPrivate.privateVal);
    }

    private void accessThis() {
        System.out.println("Private Method Accessed from same class");
    }

    private boolean accessThis(int privateVal) {
        System.out.println("Private Method Accessed from same class with value: " + privateVal);
        return false;
    }
}

class AccessPrivateFromHere {
    private void accessThisPrivate() {
        System.out.println("Private Method Accessed");
    }
}
