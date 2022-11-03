import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;


/**
 * This class draws the average line
 */
public class DrawAverageLine implements DrawAverageLineInterface {
    private Graphics graphics;
    private JPanel panel;

    public DrawAverageLine(JPanel panel) {
        this.panel = panel;
    }

    /**
     * This method draws the average line
     * @param average
     */
    public void draw(double average) {
        this.graphics = this.panel.getGraphics();
        graphics.setColor(Color.RED);
        graphics.drawLine(0, (int) average, Config.WINDOW_WIDTH - 2 * Config.PADDING, (int) average);
    }
}
