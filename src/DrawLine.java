import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * This class draws the line to connect two dots
 */
public class DrawLine implements DrawInterface {
    private Graphics graphics;
    private JPanel panel;

    public DrawLine(JPanel panel) {
        this.panel = panel;
    }

    /**
     * This method draws the line
     * @param randomIntegerInfo
     */
    public void draw(RandomIntegerInfo randomIntegerInfo) {
    	if(randomIntegerInfo.getPreviousRandomNumber() == -1) {
    		return;
    	}
        this.graphics = this.panel.getGraphics();

        graphics.drawLine(
                (int) (Config.PADDING
                        + (Config.WINDOW_WIDTH - 2 * Config.PADDING)
                        * ((randomIntegerInfo.getEntry() - 1) / (double) Config.TOTAL_ENTRIES)),
                randomIntegerInfo.getPreviousRandomNumber(),
                (int) (Config.PADDING
                        + (Config.WINDOW_WIDTH - 2 * Config.PADDING)
                        * (randomIntegerInfo.getEntry() / (double) Config.TOTAL_ENTRIES)),
                randomIntegerInfo.getCurrentRandomNumber());
    }
}
