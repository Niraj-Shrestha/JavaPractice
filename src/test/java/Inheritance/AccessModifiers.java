package Inheritance;

import PackageUsedByInheritance.NonInheritedByInheritanceAnotherPackage;

public class AccessModifiers{

    public static void main(String args[]){

        //Private Access Modifier within same class
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println("\nPrivate Access Modifier within same class: \n");
        accessModifiers.privateMethodWithinSameClass();

        //From Subclass within same file
        SubClassAM subClass = new SubClassAM();
        System.out.println("\nFrom Subclass within same file: \n");
        subClass.MethodFromSubClass();
        subClass.publicMethodFromSubClass();
        subClass.protectedMethodFromSubClass();

        //From public Subclass same package
        PublicSubClass publicSubClass = new PublicSubClass();
        System.out.println("\nFrom public Subclass same package: \n");
        publicSubClass.MethodFromSubClass();
        publicSubClass.protectedMethodFromSubClass();
        publicSubClass.publicMethodFromSubClass();

        //from same package without inheritance
        NonInheritedByInheritance nonInheritedByInheritance = new NonInheritedByInheritance();
        System.out.println("\nfrom same package without inheritance: \n");
        nonInheritedByInheritance.MethodFromSubClass();
        nonInheritedByInheritance.publicMethodFromSubClass();
        nonInheritedByInheritance.protectedMethodFromSubClass();

        //From inheritance within same package
        InheritanceMethodFromSamePackage inheritedWithinSamePackage = new InheritanceMethodFromSamePackage();
        System.out.println("\nFrom inheritance within same package: \n");
        inheritedWithinSamePackage.MethodFromSubClass();
        inheritedWithinSamePackage.publicMethodFromSubClass();
        inheritedWithinSamePackage.protectedMethodFromSubClass();

        //From another package without inheritance
        NonInheritedByInheritanceAnotherPackage nonInheritedByInheritanceAnotherPackage = new NonInheritedByInheritanceAnotherPackage();
        System.out.println("\nFrom another package without inheritance: \n");
        nonInheritedByInheritanceAnotherPackage.publicMethodFromSubClass();

        //From another package with inheritance
        InheritanceMethodFromAnotherPackage inheritedByAnotherPackage = new InheritanceMethodFromAnotherPackage();
        System.out.println("\nFrom another package with inheritance: \n");
        inheritedByAnotherPackage.publicMethodFromSubClass();
    }

    private void privateMethodWithinSameClass(){
        System.out.println("Private Method within Same class");
    }
}

class SubClassAM {
    public void publicMethodFromSubClass(){
        System.out.println("Public Method From Sub Class");
    }

    private void privateMethodFromSubClass(){
        System.out.println("Private Method From Sub Class");
    }

    protected void protectedMethodFromSubClass(){
        System.out.println("Protected Method From Sub Class");
    }

    void MethodFromSubClass(){
        System.out.println("Method From Sub Class");
    }
}

