public class AverageEvaluator {
    private int sum;

    private static AverageEvaluator instance;

    private AverageEvaluator() {
        sum = 0;
    }

    public static AverageEvaluator getInstance() {
        if (instance == null)
            instance = new AverageEvaluator();

        return instance;
    }
    
    public void computeSum(int randomInteger) {
    	sum += randomInteger;
    }

    public double getAverage() {
        return sum / Config.TOTAL_ENTRIES;
    }
    
    public void reset() {
    	sum = 0;
    }
}
