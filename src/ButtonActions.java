import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class invokes the button action.
 *
 */
public class ButtonActions implements ActionListener {
	protected JFrame frame;
	protected Graph graphPlain;
	protected Graph graphBoxed;
	protected Graph graphBarred;
	protected JButton btnRun;
	protected RandomNumberGenerator generator;

	public ButtonActions() {
		generator = new RandomNumberGenerator();
	}

	/**
	 * This method implements the button trigger.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnRun) {
			try {
				generator.reset();
				AverageEvaluator.getInstance().reset();
				generator.generateNumbers();
			} catch (InterruptedException e1) {
				// TODO: Do something with the exception
				e1.printStackTrace();
			}
		}
	}
}
