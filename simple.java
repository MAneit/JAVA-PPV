// Define a class named 'Simpleinterest1' to calculate simple interest
class Simpleinterest1{
    // Method to calculate simple interest
    public double calculateSI( double p, double r,double t){
        // Calculate and return simple interest using the formula (P * R * T)
        return(p*r*t);

    } 
 }
// Main class named 'simple
public class simple {
    public static void main(String args[]){
         // Create an instance of the 'Simpleinterest1' class
   
        Simpleinterest1 mySI = new Simpleinterest1();
         // Call the 'calculateSI' method with specific values and store the result
        double result = mySI.calculateSI(100000,0.05,5);
                // Print the result (simple interest) to the console
        System.out.println("Result: " + result);
    
}
}
