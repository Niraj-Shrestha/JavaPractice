package PackageUsedByInheritance;

public class NonInheritedByInheritanceAnotherPackage {
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
