import java.awt.Font;

public final class Config {

	private Config() {

	}

	public static int WINDOW_START_X = 100;
	public static int WINDOW_START_Y = 100;
	public static int WINDOW_WIDTH = 600;

	public static Font BUTTON_FONT = new Font("Iosevka", Font.BOLD, 14);

	public static int BUTTON_HEIGHT = 40;

	public static int BTN_RUN_WIDTH = 90;

	public static int GRAPH_HEIGHT = 200;

	public static int TOTAL_ENTRIES = 10;

	public static int PADDING = 5;
	public static int OFFSET = 20;

	public static int POINT_DIAMETER = 16;
	public static int HIGHLIGHT_DIAMETER = 4;
	
	public static int WINDOW_HEIGHT = 3 * Config.GRAPH_HEIGHT + 5 * Config.PADDING + 2 * Config.BUTTON_HEIGHT;
	
	public static String GRAPH_PLAIN = "PLAIN";
	public static String GRAPH_BOX = "BOX";
	public static String GRAPH_BAR = "BAR";
}
