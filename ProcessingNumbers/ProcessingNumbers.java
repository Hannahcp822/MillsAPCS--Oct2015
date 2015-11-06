
/**
 * Collaborative Programming Exercise
 * ProcessingNumbers:
 *     1) Accepts as user input a string of numbers.
 *     2) Prints the smallest and largest of all the numbers supplied by the user.
 *     3) Prints the sum of all the even numbers the user typed, along with the largest even number typed.
 * 
 * @author Hannah Pang 
 * @version November 5, 2015
 */

import java.util.*;

public class ProcessingNumbers
{
    
    // Prompt user for how many numbers they want to input and what those numbers are
    
    public static int promptForCount(Scanner console) {
        System.out.println("How many numbers (integers) do you want to include?");
        int count = console.nextInt();
        System.out.println();
        System.out.println("Enter " + count + " numbers (separated by spaces):");
        return count;
    }
    
    // Calculate max number, min number, max even number, and sum of even numbers (from set of inputed numbers)
    
    public static void calculations() {
        
        Scanner console = new Scanner(System.in); // create scanner
        int totalCount = promptForCount(console); // save the value returned by method promptFourCount as "totalCount"
        
        // initialize variables
        
        int max = 0;
        int min = 0;
        int maxEven = -1; // initialize maxEven to a non-even number
        int sumOfEvens = 0;
 
        // number of times for loop is executed depends on totalCount (the total number of inputed numbers)
        
        for (int i = 0; i < totalCount; i++) { 
            int number = console.nextInt(); // read inputed number, next time the for loop executes it will read the next inputed number
            
            if ((number % 2) == 0) { // check if the number is even, if so then execute this if statment
                
                // first even number will be assigned to "maxEven"
                if (maxEven == -1) { 
                    maxEven = number;
                
                // the following even numbers will be assigned to "maxEven" only if they are greater than the current "maxEven"
               } else {
                maxEven = Math.max(maxEven,number);
                
                // add the even number to "sumOfEvens"
                sumOfEvens += number;
               }
            }
            
            // first number (regardless of whether it is even or odd) will be assigned to "min" and "max"
            if (i == 0) {
                max = number;
                min = number;
                
            // the following numbers will be assigned to "max" or "min" only if they are greater than the current "max" and "min"
            } else {
                max = Math.max(max,number);
                min = Math.min(min,number);
            }
        }
        
        printValues(max, min, maxEven, sumOfEvens);        
    }
   
    // print out the largest number, smallest number, largest even number, and sum of even numbers
    // pass in calculated values from method "calculations" as parameters
    
    public static void printValues(int max, int min, int maxEven, int sumOfEvens) {
        System.out.println();
        
        // print the max and min of all the numbers
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        
        // only print max of even numbers and sum of even numbers if there were even numbers inputed
        if ((maxEven % 2) != 0) { // check if "maxEven" is original initialized value (an odd number) of if it got updated to an even number
            System.out.println("No even numbers were entered.");
        } else { 
            System.out.println("MAX of even numbers = " + maxEven);
            System.out.println("Sum of even numbers = " + sumOfEvens);
        }
    }
    
    public static void main(String[] args) {
        calculations();
    }
}

