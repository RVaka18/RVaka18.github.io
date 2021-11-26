import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours have you been parked?");
        double hours = input.nextDouble();
        
        double cost = 3.50 * hours;
        
        if( cost > 20)
        {
            cost = 20;
        }
        
        System.out.println("You owe $" + cost);
        
    }
}