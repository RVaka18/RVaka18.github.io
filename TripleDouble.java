import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many points did you score? ");
        int points = input.nextInt();
        
        System.out.println("How many rebounds did you get? ");
        int rebounds = input.nextInt();
         
        System.out.println("How many assists did you have? ");
        int assists = input.nextInt();
        
        
       boolean tenPoints = points >= 10;
       boolean tenRebounds = rebounds >= 10;
       boolean tenAssists = assists >= 10;
               
        System.out.println("You got 10 or more points: " + tenPoints);
        System.out.println("You got 10 or more rebounds: " + tenRebounds);
        System.out.println("You got 10 or more assists: " + tenAssists);
        
    }
}