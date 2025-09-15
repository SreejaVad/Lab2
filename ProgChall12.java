import java.util.Scanner;
/**
 * In ProgChall12 first have to propt the user to input a city name. Next, using
 * this input, we count the characters of the city, convert the city to all upper
 * case, convert the city to all lower case, and lastly must find the first initial
 * of the city name using index 0. 
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.0
 * @since 09/12/2025
 */
public class ProgChall12

{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        //Ask user for a city, and allow input
        System.out.print("Enter a city:" + " "); //no new line
        String cityName = input.nextLine(); //input on the same line as prompt
        
        int cityCount = cityName.length(); //city character count
        String cityUpper = cityName.toUpperCase(); //city converted to uppercase
        String cityLower = cityName.toLowerCase(); //city converted to lowercase
        char cityInit = cityName.charAt(0); //city first initial/character


        // Print blank line to create space between user input and output
        System.out.println();
        
        //Print out city character length, city in uppercase, city in lowercase, and first character of city
        System.out.println("The city entered has:" + " " + cityCount + " " + "characters");
        System.out.println("In upper case:" + " " + cityUpper);
        System.out.println("In lower case:" + " " + cityLower);
        System.out.println("First character:" + " " + cityInit);
    }
}