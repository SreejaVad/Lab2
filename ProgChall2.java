import java.util.Scanner;
/**
 * In ProgChall2, we are first prompting the user to input 1) their first name, 
 * 2) their middle name, and 3) their last name. After getting user input, we
 * must return the charachter at index 0 of each of the inputs (get the first 
 * letter of each initial. By doing this, we can then print out the entire
 * name and print out the user's initials. 
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.0
 * @since 09/12/2025
 */
public class ProgChall2

{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        //Ask user for first name, and allow input
        System.out.print("Enter your first name:" + " "); //no new line
        String firstName = input.nextLine(); //input on the same line as prompt
        
        //Ask user for middle name, and allow input
        System.out.print("Enter your middle name:" + " "); //no new line
        String middleName = input.nextLine(); //input on the same line as prompt
        
        //Ask user for name, and allow input
        System.out.print("Enter your last name:" + " "); //no new line
        String lastName = input.nextLine(); //input on the same line as prompt
        
        //Get first letter of first, middle, and last name for initials
        //First letter is at the 0th position (Index 0)
        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);
        
        // Print blank line to create space between user input and output
        System.out.println();
        
        //Print out full name and the initials
        System.out.println("My name is:" + " " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are:" + " " + firstInit + middleInit + lastInit);
    }
}