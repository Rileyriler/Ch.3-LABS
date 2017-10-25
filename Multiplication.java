
/**
 * Write a description of class Multiplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplication
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Multiplication
     */
    public Multiplication()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        for(int k = 1; k <= 12; k++){
            for(int j = 1; j <= 12; j++){
                System.out.print((k*j) + " ");
            }
            System.out.println();
        }      
            
    }
}
