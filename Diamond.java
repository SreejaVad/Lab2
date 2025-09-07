
/**
 * This program displays a diamond that is made using a series of print statements. Each print statement has a series of asterisks (*) and 
 * spaces to make up the shape of a symmetrical diamond. In lieu of spaces, I defined the width of the right-alignment and formatted each line that way.
 * @author Sreeja Vadlamudi, svadlamudi@student.sdccd.edu
 * @version v1.2
 * @since 09/05/2025
 */ 

public class Diamond //start Diamond
{
    public static void main(String[] args) 
    {
        /*
         * Originally when completing this lab, I just used 7 println statements in order to create the shape of the diamond. 
         * After rereading the instructions, I was concerned that I may have misread the directions, specifically when it says, 
         * "There are no spaces and 7 stars on line 4." I was unsure if the no spaces was refering to just line 4, or all the lines. 
        System.out.println("   *"); // 1 star, 3 spaces
        System.out.println("  ***"); // 3 stars, 2 spaces
        System.out.println(" *****"); // 5 stars, 1 space
        System.out.println("*******"); // 7 stars, no spaces
        System.out.println(" *****"); // 5 stars, 1 space
        System.out.println("  ***"); // 3 stars, 2 spaces
        System.out.println("   *"); // 1 star, 3 spaces
        */
       
        /* I instead looked into print statements, where I could change the formatting of each line, without manually entering spaces
         * What I found after doing some reading is that %_s, would change the format and right-align the stars based on the given width
         * The "%" is the start of the fomatting, the numerical value that is given is the width of indentation, and the "s" is saying to treat the agrument like a string
         * After trial and error, I realized that I had to add the values of the leading spaces and the stars to get the correct value of the width
         * For line 1, for example, it has 3 leading spaces and 1 star, so I needed a width of 4, since the indentation includes the length of the character as well
         */
        System.out.printf("%4s %n","*");
        System.out.printf("%5s %n","***");
        System.out.printf("%6s %n","*****");
        System.out.printf("%s %n", "*******");
        System.out.printf("%6s %n","*****");
        System.out.printf("%5s %n","***");
        System.out.printf("%4s %n","*");
    }
} //end Diamond 