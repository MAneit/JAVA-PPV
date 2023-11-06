
public class bekss {
    public static void main(String args []){
        for (int i=1; i<=5;i++){// Outer loop iterating from 1 to 5
            for(int j=1;j<=i;j++){// Inner loop iterating from 1 to the current value of i
                if (i==2 && j==3){// If the current values of i and j are 2 and 3, exit the inner loop
                    break;
                }
               System.out.print(i+" ");// Print the current value of i followed by a space
            }
System.out.println(); // Move to a new line after the inner loop completes
}
        }
    }
}
