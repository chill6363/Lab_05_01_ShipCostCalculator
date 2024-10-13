import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;
        String trash = "";
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Enter the cost of the item: ");

        if(in.hasNextDouble())
        {
            itemCost = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            trash = in.nextLine(); // Ok have to read the input as a String
            System.out.println("\nYou said your wage was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }

        if(itemCost < 100){
            shipCost = itemCost * 0.02;
            totalCost = itemCost + shipCost;
        }
        System.out.println("The shipping cost is " + df.format(shipCost) + ". The total cost is " + df.format(totalCost));
    }
}