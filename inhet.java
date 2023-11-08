// Define a class named mane
class MANE {
    // Define a method 'c' that takes a character 'd' as a parameter
    void c(double d){
        System.out.println("chlease");
    } 
}
// Define a class named A that extends PRINE
class A extends MANE{
     // Define a method 'kan' that takes a character 's' as a parameter
void kan(double s){
    System.out.println("livepool");
}
}
// Define a class named B that extends PRINE
  class B extends MANE{
    // Define a method 'kas' that takes a character 'k' as a parameter
    void kas(double k){
        System.out.println("machestcity");
    }
  }
  class C extends B{
    void kam(int p){
        System.out.println("manuchestcity");
    }
  }

interface MyInterface {
    void interfaceMethod();
}

class InterfaceClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("morning");
    }
}
public class inhet {
    public static void main(String[] args) {
        // Create objects of each class
        InterfaceClass interfaceObj = new InterfaceClass();
        A subA = new A();
        B subb = new B();
        C subc= new C();
    

        // Call methods on the objects
       
         subA. c(5);
        subA.kan(2);
        subb.kas(2);
        subc.kam(3);
        
         interfaceObj.interfaceMethod();
    }
}
    






    



