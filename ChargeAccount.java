// ***************************************************************
//   ChargeAccount.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  
           double additionalCharges;  
           double interestPercentage = 0.02;
           double interestAmount;
           double totalAmount;
           double minimumPayment = 0.0;
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the Previous Balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the Additional Charges: ");
           additionalCharges = scan.nextDouble();
 
           // Compute the raise using if ...
           interestAmount = interestPercentage * (additionalCharges + previousBalance);
           totalAmount = previousBalance + additionalCharges + interestAmount;
           if(totalAmount < 50) {
               minimumPayment = totalAmount;
            }
           else if(totalAmount <= 300) {
               minimumPayment = 50;
            }
           else if(totalAmount > 300){
                minimumPayment = (totalAmount * .2);
            }
            
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges:          " + money.format(additionalCharges));
           System.out.println("Total Interest Amount:          " + money.format(interestAmount));
           System.out.println();
           System.out.println("New Balance:           " + money.format(totalAmount));
           System.out.println();
           System.out.println("Minimum Payment:           " + money.format(minimumPayment));
           
        }
}