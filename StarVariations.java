
/**
 * Write a description of class StarVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarVariations
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        // put your code here
        final int MAX_ROWS = 10;
        
        for (int row=1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row=1; row <= MAX_ROWS; row++)
        {
            for (int star = MAX_ROWS; star >= row; star--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
