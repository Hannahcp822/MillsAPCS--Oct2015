
/**
 * Homecoming Programming Project
 * 
 * @author Hannah Pang 
 * @version October 26, 2015
 */

import java.util.*;

public class Homecoming
{
   // Exercise 1 - Introduces yourself to a prospective Homecoming date and ask their name
   public static String getADate(Scanner userinput, String myName)
   {
       System.out.println("Hi! My name is " + myName);
       // prompt the user to type their name, define the user input as a String called "theirName"
       System.out.print("What's your name? ");
       String theirName = userinput.nextLine(); 
       System.out.println("Nice to meet you " + theirName);
       // prompt the user to respond if they would like to go to Homecoming
       System.out.print("Would you like to go to Homecoming with me? ");
       String answer = userinput.nextLine();
       System.out.println("Great! It'll be a magical night -- " + myName + " and " + theirName + " going to the Mills Homecoming Dance 2015!");
       // return the user's input (theirName)
       return theirName;
   }
   
   // Exercise 2 - Prompts user for the costs for tickets, flowers, pictures, dinner, new clothes, and other expenses
   public static void damage(Scanner userinput, String theirName)
   {
       System.out.println();
       System.out.println("Let's figure out the damage for the evening.");
       System.out.println("What are your estimated costs?");
       // prompt the user to type the cost for each item, save each user input as a double variable 
       System.out.print("Tickets (each): $");
       double ticketPrice = userinput.nextDouble();
       System.out.print("Flowers (total for both of you): $");
       double flowerPrice = userinput.nextDouble();
       System.out.print("Pictures: $");
       double picturePrice = userinput.nextDouble();
       System.out.print("Dinner (per meal): $");
       double dinnerPrice = userinput.nextDouble();
       System.out.print("New clothes (tie to match dress? Vest? Dress? Non-tennis shoes?): $");
       double clothesPrice = userinput.nextDouble();
       System.out.print("Any other expenses (hair, makeup, limo, etc): $");
       double miscPrice = userinput.nextDouble();
       // calculate the subtotal by adding up prices of each item
       double subtotalPrice = ticketPrice + flowerPrice + picturePrice + dinnerPrice + clothesPrice + miscPrice;
       // sales tax is 8.25%... calculate the tax on taxable items (food, clothes, other expenses) by multiplying by 0.0825
       double tax = (dinnerPrice * 0.0825) + (clothesPrice * 0.0825) + (miscPrice * 0.0825);
       tax = (double)Math.round(tax*100)/100; // round the sales tax 
       // calculate the total price by adding subtotal and sales tax
       double totalPrice = subtotalPrice + tax;
       System.out.println("So, you should expect to spend, including tax, $" + totalPrice);
       System.out.println("If you split the cost with your date, each will pay: $" + (totalPrice / 2));
       System.out.println();  
       // call statsTable method and give it the necessary parameters (userinput, theirName, and all the prices)
       statsTable(userinput, theirName, ticketPrice, flowerPrice, picturePrice, dinnerPrice, clothesPrice, miscPrice, subtotalPrice, tax, totalPrice);
   }
   
   // Exercise 3 - neatly outputs MHS Homecoming 2015, names, prices for everything, subtotal, sales tax, total price
   // statsTable accepts the user's cost stats as parameters
   public static void statsTable(Scanner userinput, String theirName, double ticketPrice, double flowerPrice, double picturePrice, double dinnerPrice, double clothesPrice, 
                                 double miscPrice, double subtotalPrice, double tax, double totalPrice)
   {
       System.out.println("MHS Homecoming 2015");
       System.out.println("Vickie Viking and " + theirName);
       System.out.println();
       // print all the prices as well as subtotal, sales tax, and total price... use tabs to align everything
       System.out.println("Tickets (Total):\t\t\t$" + (ticketPrice*2));
       System.out.println("Flowers (for both of you):\t\t$" + flowerPrice);
       System.out.println("Pictures:\t\t\t\t$" + picturePrice);
       System.out.println("Dinner (for two):\t\t\t$" + dinnerPrice);
       System.out.println("New clothes:\t\t\t\t$" + clothesPrice);
       System.out.println("Any other expenses:\t\t\t$" + miscPrice);
       System.out.println();
       System.out.println("\t\t\tSubtotal\t$" + subtotalPrice);
       System.out.println("\t\t\tSales tax\t$" + tax);
       System.out.println("\t\t\tTotal\t\t$" + totalPrice);
   }
   
   public static void main(String[] args)
   {
       // create the scanner "userinput" 
       Scanner userinput = new Scanner(System.in); 
       // create constant "myName"... assign it to whatever name
       final String myName = "Vickie Viking"; 
       // call method getADate, pass "userinput" and "myName" to it
       // the name that gets returned by method getADate is assigned to String "theirName"
       final String theirName = getADate(userinput, myName);
       // call method damage, pass "userinput" and "theirName" to it
       damage(userinput, theirName);
   }
}

