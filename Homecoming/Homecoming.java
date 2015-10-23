
/**
 * Write a description of class Homecoming here.
 * 
 * @author Hannah Pang 
 * @version October 23, 2015
 */

import java.util.*;

public class Homecoming
{
   public static void getADate(String myName)
   {
       System.out.println("Hi! My name is " + myName);
       System.out.print("What's your name? ");
       String theirName = userinput.nextLine();
       return theirName; 
       System.out.println("Nice to meet you " + theirName);
       System.out.print("Would you like to go to Homecoming with me? ");
       String answer = userinput.nextLine();
       System.out.println("Great! It'll be a magical night -- " + myName + " and " + theirName + " going to the Mills Homecoming Dance 2015!");
   }
   
   public static void damage()
   {
       System.out.println("Let's figure out the damage for the evening.");
       System.out.println("What are your estimated costs?");
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
       double subtotalPrice = ticketPrice + flowerPrice + picturePrice + dinnerPrice + clothesPrice + miscPrice;
       double tax = (dinnerPrice * 0.0825) + (clothesPrice * 0.0825) + (miscPrice * 0.0825);
       double totalPrice = subtotalPrice + tax;
       System.out.println("So, you should expect to spend, including tax, $" + totalPrice);
       System.out.println("If you split the cost with your date, each will pay: $" + (totalPrice / 2));
       System.out.println();
       statsTable(theirName, ticketPrice, flowerPrice, picturePrice, dinnerPrice, clothesPrice, miscPrice, subtotalPrice, tax, totalPrice);
   }
   
   public static void statsTable(String theirName, double ticketPrice, double flowerPrice, double picturePrie, double dinnerPrice, double clothesPrice, 
                                 double miscPrice, double subtotalPrice, double tax, double totalPrice)
   {
       System.out.println("MHS Homecoming 2015");
       System.out.println("Vickie Viking and " + theirName);
       System.out.println();
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
       Scanner userinput = new Scanner(System.in);
       String myName = "Vickie Viking";
       getADate(userinput);
       System.out.println();
       damage(userinput);
       System.out.println();
       statsTable(userinput);
   }
}

