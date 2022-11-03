import java.awt.EventQueue;

/*This class launches the application
 *
 * @author Tushar Anand
 *
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