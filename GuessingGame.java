import java.util.Scanner;
import java.util.Random;
class GuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String check="yes";
        System.out.println("\t\t\tWELCOME TO NUMBER GUESSING GAME!!");
        System.out.println();
        while(check.equals("yes"))
        {
            Random rand= new Random();
            int num= rand.nextInt(100);
            int tries= 0;
            int guess=-1;
            
            while(num!=guess)
            {
                System.out.print("Guess a number between 1 to 100: ");
                guess= sc.nextInt();
                tries++;
                if(guess==num)
                {
                    System.out.println("You guessed it Right!!");
                    System.out.println("number of tries: "+tries);
                    System.out.print("again? yes or no :");
                    check= sc.next().toLowerCase();
                }
                else if(guess>num){
                    System.out.println("Guess is too high. Try again.");
                }
                else{
                    System.out.println("Guess is too low. Try again.");
                }
            }
        }
        if(check!="yes"){
            System.out.println();
            System.out.println("Thanks for playing the game.");
        }
        sc.close();
    }
}