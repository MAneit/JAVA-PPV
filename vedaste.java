// Define an interface
interface MyInterface {
    void interfaceMethod();
}

// Create a class that implements the interface
class InterfaceClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("InterfaceClass's interfaceMethod called");
    }
}

// Create a superclass
class SuperClass {
    void superMethod() {
        System.out.println("SuperClass's superMethod called");
    }
}

// Create a subclass that extends SuperClass
class SubClass extends SuperClass {
    void subMethod() {
        System.out.println("SubClass's subMethod called");
    }
}

// Create another class
class AnotherClass {
    void anotherMethod() {
        System.out.println("AnotherClass's anotherMethod called");
    }
}

public class vedaste {
    public static void main(String[] args) {
        // Create objects of each class
        InterfaceClass interfaceObj = new InterfaceClass();
        SubClass subObj = new SubClass();
        AnotherClass anotherObj = new AnotherClass();

        // Call methods on the objects
        interfaceObj.interfaceMethod();
        subObj.superMethod();
        subObj.subMethod();
        anotherObj.anotherMethod();
    }
}
