/**
 * @author Tushar Sameer Anand
 * This is a singleton class that calculates sum and average
 */
public class AverageEvaluator {
    private int sum;
    private int count;

    private static AverageEvaluator instance;

    private AverageEvaluator() {
        sum = 0;
        count = 0;
    }

    /**
     * This function returns the instance of the class
     * @return
     */
    public static AverageEvaluator getInstance() {
        if (instance == null)
            instance = new AverageEvaluator();

        return instance;
    }
    
    /**
     * This method calculates sum
     * @param randomInteger
     */
    public void computeSum(int randomInteger) {
    	count++;
    	sum += randomInteger;
    }

    /**
     * This method computes average
     * @return
     */
    public double getAverage() {
        return sum / count;
    }
    
    /**
     * This method resets the sum for the next Run
     */
    public void reset() {
    	sum = 0;
    	count = 0;
    }
}
