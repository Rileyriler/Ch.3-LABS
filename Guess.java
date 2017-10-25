// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;    //The user's guess
          int attempts = 0;
          int attemptsLow = 0;
          int attemptsHigh = 0;
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
          //print message asking user to enter a guess
          System.out.println("Enter a Guess between 1 and 10: ");
 
          //read in guess
          guess = scan.nextInt();   
          attempts += 1; 
          while (guess != numToGuess)  //keep going as long as the guess is wrong
           {
                  //print message saying guess is wrong
                  System.out.println("Incorrect!  Try again: ");
                  
                  if(guess > numToGuess)
                  {
                      System.out.println("Your number is too high!");
                      attemptsHigh += 1;
                  }
                    else if(guess < numToGuess){
                      System.out.println("Your number is too low!");
                      attemptsLow += 1;
                  }
                  //get another guess from the user
                  guess = scan.nextInt(); 
                  attempts += 1; 
          }
 
          //print message saying guess is right
          System.out.println("Congratulations You Are CORRECT!!!");
          System.out.println("It took you " + attempts + " guesses");
          System.out.println("Guesses too high: " + attemptsHigh);
          System.out.println("Guesses too low: " + attemptsLow);
        }
}