import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String check="yes";
    while(check.equals("yes"))
    {
        String[] option= {"r","p","s"};
        String cMove= option[new Random().nextInt(option.length)];
        String pMove;
        
        while(true){
            System.out.print("Enter your move('r','p','s'): ");
            pMove= sc.next();
            if(pMove.equals("r") || pMove.equals("p") || pMove.equals("s")){
                break;
            }
            else{
                System.out.println("Please enter the valid choice!");
            }
        }
        System.out.println(cMove+" is computer move.");
        if(pMove.equals(cMove)){
            System.out.println("The game was a tie!");
        }
        else if(pMove.equals("r")){
            if(cMove.equals("p"))
                System.out.println("You lose!!");
            else{
                System.out.println("You won!!");
            }
        }
        else if(pMove.equals("p")){
            if(cMove.equals("s"))
                System.out.println("You lose!!");
            else{
                System.out.println("You won!!");
            }
        }
        else if(pMove.equals("s")){
            if(cMove.equals("r"))
                System.out.println("You lose!!");
            else{
                System.out.println("You won!!");
            }
        }
        
        System.out.print("Do you want to play again? yes or no: ");
        check= sc.next().toLowerCase();
    }
    
    if(check !="yes"){
        System.out.println("THANKS FOR PLAYING!!");
    }
    }
}