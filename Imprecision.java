
/**
 * This program displays floating point imprecision. We see this specifically when multiplying x by its reciprocal (1/x)
 * which should ideally provide us with the value 1.0, however, due to rounding errors, instead we see a small difference in value.  
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.0
 * @since 09/05/2025
 */ 

public class Imprecision //start Imprecision
{
    // instance variables - replace the example below with your ow
    
    public static void main(String[] args) 
    {
        double x = 12345.6789e200;
        double y = 1/x;
        double z = y * x;
        
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
} //end Imprecision 