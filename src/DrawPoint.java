import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * This class draws the dots
 *
 */
public class DrawPoint implements DrawInterface {
    private JPanel panel;
    private Graphics graphics;

    public DrawPoint(JPanel panel) {
        this.panel = panel;
    }

    /**
     * This method draws the point
     * @param randomIntegerInfo
     */
    public void draw(RandomIntegerInfo randomInteger) {
        this.graphics = this.panel.getGraphics();

        graphics.drawArc(
                (int) (Config.PADDING
                      + (Config.WINDOW_WIDTH - 2 * Config.PADDING)
                                * (randomInteger.getEntry() / (double) Config.TOTAL_ENTRIES)
                        - (Config.POINT_DIAMETER / 2)),
                randomInteger.getCurrentRandomNumber() - (Config.POINT_DIAMETER / 2),
                Config.POINT_DIAMETER,
                Config.POINT_DIAMETER,
                0,
                360);
    }
}
