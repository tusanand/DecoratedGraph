import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawBox extends DrawDecorator {
    protected JPanel panel;
    protected Graphics graphics;

    public DrawBox(JPanel panel) {
        this.panel = panel;
    }

    public void draw(RandomIntegerInfo randomIntegerInfo) {
    	super.draw(randomIntegerInfo);
        this.graphics = this.panel.getGraphics();
        graphics.drawRect(
                (int) (Config.PADDING
                        + (Config.WINDOW_WIDTH - 2 * Config.PADDING)
                                * (randomIntegerInfo.getEntry() / (double) Config.TOTAL_ENTRIES)
                        - (Config.POINT_DIAMETER / 2)),
                randomIntegerInfo.getCurrentRandomNumber() - (Config.POINT_DIAMETER / 2),
                Config.POINT_DIAMETER,
                Config.POINT_DIAMETER);
    }
}
