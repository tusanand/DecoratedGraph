import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;

public class DrawAverageLine implements DrawAverageLineInterface {
    private Graphics graphics;
    private JPanel panel;

    public DrawAverageLine(JPanel panel) {
        this.panel = panel;
    }

    public void draw(double average) {
        this.graphics = this.panel.getGraphics();
        graphics.setColor(Color.RED);
        graphics.drawLine(0, (int) average, Config.WINDOW_WIDTH - 2 * Config.PADDING, (int) average);
    }
}
