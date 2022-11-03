import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class initializes the frame and all of its components
 */
public class InitializeFrame extends ButtonActions {
	public InitializeFrame() {
		this.initialize();
		this.frame.setVisible(true);
	}

  /**
   * Initialize the contents of the frame.
   */
  @SuppressWarnings("deprecation")
public void initialize() {
    frame = new JFrame();
    frame.setTitle("Random Number Graph Generator");
    frame.setBounds(Config.WINDOW_START_X, Config.WINDOW_START_Y, Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    graphPlain = new Graph();
    graphPlain.setBounds(
        Config.PADDING,
        Config.PADDING,
        Config.WINDOW_WIDTH - 25,
        Config.GRAPH_HEIGHT);
    frame.getContentPane().add(graphPlain);
    graphPlain.setGraphType(Config.GRAPH_PLAIN);
    graphPlain.setBorder(BorderFactory.createLineBorder(Color.black));

    graphBoxed = new Graph();
    graphBoxed.setBounds(
        Config.PADDING,
        Config.GRAPH_HEIGHT + 2 * Config.PADDING,
        Config.WINDOW_WIDTH - 25,
        Config.GRAPH_HEIGHT);
    frame.getContentPane().add(graphBoxed);
    graphBoxed.setGraphType(Config.GRAPH_BOX);
    graphBoxed.setBorder(BorderFactory.createLineBorder(Color.black));

    graphBarred = new Graph();
    graphBarred.setBounds(
        Config.PADDING,
        2 * Config.GRAPH_HEIGHT + 3 * Config.PADDING,
        Config.WINDOW_WIDTH - 25,
        Config.GRAPH_HEIGHT);
    frame.getContentPane().add(graphBarred);
    graphBarred.setGraphType(Config.GRAPH_BAR);
    graphBarred.setBorder(BorderFactory.createLineBorder(Color.black));

    btnRun = new JButton("Run");
    btnRun.setFont(Config.BUTTON_FONT);
    btnRun.setBounds(
        Config.PADDING,
        3 * Config.GRAPH_HEIGHT + 4 * Config.PADDING,
        Config.WINDOW_WIDTH - 25,
        Config.BUTTON_HEIGHT);
    btnRun.addActionListener(this);
    frame.getContentPane().add(btnRun);
    
    generator.addObserver(graphPlain);
    generator.addObserver(graphBoxed);
    generator.addObserver(graphBarred);
  }
}
