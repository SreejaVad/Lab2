import java.util.Scanner;
/**
 * ProgChall13 does the following:
 * 1) Prompt the user to input meal amount and compiler will read input as number
 * 2) Create constants for the tax (6.75%) and tip (20%) amount
 * 3) Multiply the tax and tip rate with the inputted meal amount
 * 4) Add the calculated tip and tax to the inputted meal amount to find total cost
 * 5) Print the calculated tax, tip, and total cost of meal
 * 6) To print, use %,.2f in order to round all decimals to the hundreths place
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.0
 * @since 09/12/2025
 */
public class ProgChall13
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        //Ask user for meal cost, and allow user input
        System.out.print("Enter meal amount:" + " " + "$"); //no new line
        //use nextDouble instead of nextLine to read input as a number
        double mealAmount = input.nextDouble();  
        
        // Tax rate and Tip rate (constants)
        final double TAX = 0.0675; // tax = 6.75%
        final double TIP = 0.20; // tip = 20%
        
        //Final caluculations of tax, tip, and total
        double taxCalculation = mealAmount * TAX;
        double tipCalculation = mealAmount * TIP;
        double totalCost = mealAmount + taxCalculation + tipCalculation;


        // Print blank line to create space between user input and output
        System.out.println();
        
        //Print out the calculated tip, tax, and total cost of meal. Round all decimals to the hundreth place
        System.out.printf("The tax is: $%,.2f\nThe tip is: $%,.2f\nThe meal cost with tax and tip is: $%,.2f", taxCalculation, tipCalculation, totalCost);
    }
}