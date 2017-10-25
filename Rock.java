// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    static String personPlay;    //User's play -- "R", "P", or "S"
    static String computerPlay;  //Computer's play -- "R", "P", or "S"
    static int computerInt;
    public static void main(String[] args)
    {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        System.out.print("Enter your play: (r, p, or s)  ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string
        computerPlays();
        whoWon();
    }
    
    public static void computerPlays() {
        if (computerInt == 0){
            computerPlay = "R";
        }
        else if (computerInt == 1){
            computerPlay = "P";
        }
        else{
            computerPlay = "S";
        }
        //Print computer's play
        System.out.println("Computer played:  " + computerPlay);
        //See who won.
    }
    
    public static void whoWon() {
        if(personPlay.equals(computerPlay)){
            System.out.print("You both put the Same!!!");
        }
        else if (computerPlay.equals("R") && personPlay.equals("S")){
            System.out.print("The computer's rock crushes your scissors");
        }
        else if (computerPlay.equals("S") && personPlay.equals("R")){
            System.out.print("Your rock crushes the computer's scissors");
        }
        else if (computerPlay.equals("P") && personPlay.equals("S")){
            System.out.print("Your scissors cut the computer's paper");
        }
        else if (computerPlay.equals("S") && personPlay.equals("P")){
            System.out.print("The Computer's scissors cut your paper");
        }
        else if (computerPlay.equals("P") && personPlay.equals("R")){
            System.out.print("The computer's paper wraps your rock");
        }
        else if (computerPlay.equals("R") && personPlay.equals("P")){
            System.out.print("Your Paper wraps the computer's rock");
        }
    }
}