import java.util.Scanner;
/**
 * In ProgChall15 we must first prompt the user to input how mnay shares they purchased 
 * and how much each of the shares cost. Based upon this, we muliply the share cost
 * with the number of shares purchased to find the cost of all of the shares.
 * Next we calculate the commission rate (2%) by multiplying the rate with the
 * cost of all of the shares to find the commission cost. Lastly we add the commission
 * cost with the cost of all of the shares to find the total cost. 
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.0
 * @since 09/12/2025
 */
public class ProgChall15
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        //Ask user for number of shares purchased
        System.out.print("Enter number of shares purchased:" + " "); //no new line
        //use nextDouble instead of nextLine to read input as a number
        double sharesPurchased = input.nextDouble();  
        
        //Ask user for price per share
        System.out.print("Enter price per share:" + " " + "$"); //no new line
        //use nextDouble instead of nextLine to read input as a number
        double sharePrice = input.nextDouble();
        
        // Commission rate (constant)
        final double COMM_RATE = 0.02; // commission rate = 2%
        
        //Final caluculations of tax, tip, and total
        double totalSharesCost = sharesPurchased * sharePrice;
        double commissionCost = totalSharesCost * COMM_RATE;
        double totalCost = totalSharesCost + commissionCost;

        // Print blank line to create space between user input and output
        System.out.println();
        
        //Print out the calculated tip, tax, and total cost of meal. Round all decimals to the hundreth place
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f", totalSharesCost, commissionCost, totalCost);
    }
}