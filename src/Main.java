
import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gasTank =0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double totalCost;
        double maxDistance;
        String trash = "";

        System.out.print("Enter the number of gallons of gas in the tank: ");
        if(in.hasNextDouble())
        {
            gasTank= in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble())
        {
            fuelEfficiency= in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        System.out.print("Enter the price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            gasPrice= in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        totalCost = 100 / fuelEfficiency * gasPrice;
        System.out.println("The total cost per 100 miles is: " + totalCost);
        maxDistance = fuelEfficiency * gasTank;
        System.out.println("The maximum distance is: " + maxDistance);

        // write your code here
    }
}