
/**
 * This is a decorator class
 *
 */
public abstract class DrawDecorator implements DrawInterface {
	protected DrawInterface drawInterface;
	
	
	/**
	 * This method sets different types of decorator implemented
	 * @param drawInterface
	 */
	public void setDrawInterface(DrawInterface drawInterface) {
		this.drawInterface = drawInterface;
	}
	
	/**
	 * This method calls the draw method of the super class
	 */
	public void draw(RandomIntegerInfo randomIntegerInfo) {
		if(drawInterface != null) {
			drawInterface.draw(randomIntegerInfo);
		}
	}
}
