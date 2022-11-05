import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * This class adds panel to the frame
 *
 */
@SuppressWarnings("deprecation")
public class Graph extends JPanel implements Observer {
	private String graphType;
	
    public Graph() {
    }

	@Override
	public void update(Observable o, Object arg) {	
		RandomIntegerInfo randomIntegerInfo = ((RandomNumberGenerator) o).getGeneratedData();
		DrawInterface drawPoint = new DrawPoint(this);
		DrawBox drawBox = new DrawBox(this);
		DrawBar drawBar = new DrawBar(this);
		if(graphType == Config.GRAPH_BOX) {
			drawBox.setDrawInterface(drawPoint);
			drawBox.draw(randomIntegerInfo);
		} else if(graphType == Config.GRAPH_BAR) {
			drawBox.setDrawInterface(drawPoint);
			drawBar.setDrawInterface(drawBox);
			drawBar.draw(randomIntegerInfo);
		} else {
			drawPoint.draw(randomIntegerInfo);
		}
		DrawInterface drawLine = new DrawLine(this);
		drawLine.draw(randomIntegerInfo);
		
		if(randomIntegerInfo.getEntry() + 1 == Config.TOTAL_ENTRIES) {
			DrawAverageLineInterface drawAverageLine = new DrawAverageLine(this);
			drawAverageLine.draw(AverageEvaluator.getInstance().getAverage());
		}
	}
	
	/**
	 * This method sets the different types of panels
	 * @param graphType
	 */
	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}
}