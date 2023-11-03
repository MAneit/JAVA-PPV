//difine a class named 'compound'
class compound {
     // Method to calculate compound interest
    public double calculateC(double p,double r,double t, double n){
        return p*( Math.pow((1+r/n),(n*t))); // Calculate and return the compound interest using the formula
    }
}
public class kan{  // Main class named 'kan'
public static void main(String args[]){
    // Create an instance of the 'compound' class
    compound myCompound=new compound();
     // Call the 'calculateC' method with specific values and store the 
    double result=myCompound.calculateC(500000, 0.18, 3, 12);
    System.out.println("Result: " + result); // Print the result to the console
}
}
