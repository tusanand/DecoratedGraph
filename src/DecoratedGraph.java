import java.awt.EventQueue;

/**
 * @author Tushar Sameer Anand
 * This is the main class that launches the application
 */
public class DecoratedGraph {
	 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new InitializeFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}