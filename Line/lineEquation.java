
/**
 * prints a line equatino in format Y= mX + b
 * 
 * @author Roy Midence 
 * @version 9/20/16
 */
public class lineEquation
{
    private String lineEquation;
    /**
     * Constructor creates line object
     * takes y intercept double, and slope double
     * no output because constructor
     * lineEquation(30, 1.5);
     */
    public lineEquation(double yInter, double slope)
    {
        // initialise instance variables
        lineEquation = "Y= " + slope +  "X + " + yInter;
    }

    /**
     * This method prints out the full equation
     *  takes no input
     * outputs the full equation
     *  getEquation(); would print out somthing like "Y= 1.5X + 30".
     */
    public void getEquation()
    {
       System.out.println(lineEquation);
    }
}
