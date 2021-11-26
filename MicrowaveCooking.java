public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       double seconds = (int)(Math.random() * 60);
       System.out.println("Microwaving for " + seconds + " seconds");
       
       if(seconds <= 20){
           System.out.println("Perfect cooking time!");
       }
       if(seconds > 20){
           System.out.println("Your roll will catch fire!");
       }
    }
}