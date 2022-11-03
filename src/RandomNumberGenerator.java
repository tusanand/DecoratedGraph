import java.util.Observable;
import java.util.Random;

/**
 * This class generates random number
 *
 */
@SuppressWarnings("deprecation")
public class RandomNumberGenerator extends Observable {
    private int count = 0;
    private RandomIntegerInfo randomIntegerInfo;

    public RandomNumberGenerator() {
    	randomIntegerInfo = new RandomIntegerInfo();
    }

    /**
     * This method generates random number
     * @throws InterruptedException
     */
    public void generateNumbers() throws InterruptedException {
        for (int i = 0; i < Config.TOTAL_ENTRIES; ++i) {
            Random random = new Random();
            int nextRandomNumber = random.nextInt(Config.GRAPH_HEIGHT);
            if (count == 0) {
            	randomIntegerInfo.setPreviousRandomNumber(-1);
        	} else {
        		randomIntegerInfo.setPreviousRandomNumber(randomIntegerInfo.getCurrentRandomNumber());
        	}
            randomIntegerInfo.setCurrentRandomNumber(nextRandomNumber);
            randomIntegerInfo.setEntry(count++);
            AverageEvaluator.getInstance().computeSum(nextRandomNumber);
            setChanged();
            notifyObservers();
            Thread.sleep(250);
        }
    }
    
    /**
     * This method resets the application for the next run
     */
    public void reset() {
    	count = 0;
    }
    
    /**
     * This method returns the random number generated
     * @return
     */
    public RandomIntegerInfo getGeneratedData() {
    	return randomIntegerInfo;
    }

}
