import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("how many grams of sugar have you eaten today?");
        int sugar = input.nextInt();
        
        boolean moreSugar = sugar < 30;
        System.out.println("You can eat more sugar: " + moreSugar);
    }
}