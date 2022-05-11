/*
Shogo Terashima
B2001046
 */
package Question2;
import java.util.Scanner;

public class Recursion {
    
    public static double loop_pow (double m, int n) {
        double result = 1;
        // loop n times
        for (int i = 1 ; i <= n ; i ++){
            result = result * m;
        }
        
        return result;
    }
    
    public static double recursion_pow (double m, int n) {
        if ( n == 0 ) {return 1;}
        return ( m * recursion_pow(m,n-1));
         
    }
    
    public static double alter_recursion_pow (double m, int n) {
        if ( n == 0 ) {return 1;}

        if (n % 2 == 1) {
            return (m * alter_recursion_pow(m, (n-1) / 2 ) * alter_recursion_pow(m, (n-1) / 2 ));
        } else {
            return (alter_recursion_pow(m, n / 2 ) * alter_recursion_pow(m, n / 2 ));  // m^n = m * m^((n-1)/2) * m^((n-1)/2)
        }
       
         
    }
    
  public static void main (String args[]) {
      
      // get start time
      long startTime = System.nanoTime();

      double m = 3;
      int n = 5;
     
      // running function
     loop_pow(m,n);
     
      // get end time
      long endTime = System.nanoTime();
        
      // calculate time
      System.out.println("Time：" + (endTime - startTime) + " nano sec");
  }  
}
