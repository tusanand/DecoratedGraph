
public abstract class DrawDecorator implements DrawInterface {
	protected DrawInterface drawInterface;
	
	public void setDrawInterface(DrawInterface drawInterface) {
		this.drawInterface = drawInterface;
	}
	
	public void draw(RandomIntegerInfo randomIntegerInfo) {
		if(drawInterface != null) {
			drawInterface.draw(randomIntegerInfo);
		}
	}
}
